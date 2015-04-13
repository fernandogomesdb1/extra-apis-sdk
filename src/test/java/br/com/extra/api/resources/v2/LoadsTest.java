package br.com.extra.api.resources.v2;

import br.com.extra.api.core.exception.ServiceDataManipulationException;
import br.com.extra.api.pojo.MetadataItem;
import br.com.extra.api.pojo.v2.loads.ProductsStatus;
import br.com.extra.api.pojo.v2.loads.Sku;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoadsTest {

    private static Loads loads;

    @BeforeClass
    public static void setUpClass() throws Exception {
        loads = mock(Loads.class);

        when(loads.getPendingLoadedProducts()).thenCallRealMethod();
    }

    @Test(expected = ServiceDataManipulationException.class)
    public void should_not_return() throws Exception {
        when(loads.getLoadedProductsStatus(null, "PENDING", 0, 100)).thenReturn(
                produceProductStatus(150, 100));
        when(loads.getLoadedProductsStatus(null, "PENDING", 99, 100)).thenReturn(
                produceProductStatus(150, 40));

        loads.getPendingLoadedProducts();
    }

    @Test
    public void should_return_without_pagination() throws Exception {
        for (int i = 0; i <= 1200; i++) {
            should_return(i);
        }
    }

    private void should_return(int quantity) throws Exception {
        when(loads.getLoadedProductsStatus(null, "PENDING", 0, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 100 ? quantity : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 99, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 200 ? quantity - 100 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 199, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 300 ? quantity - 200 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 299, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 400 ? quantity - 300 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 399, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 500 ? quantity - 400 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 499, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 600 ? quantity - 500 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 599, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 700 ? quantity - 600 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 699, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 800 ? quantity - 700 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 799, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 900 ? quantity - 800 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 899, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 1000 ? quantity - 900 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 999, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 1100 ? quantity - 1000 : 100)));
        when(loads.getLoadedProductsStatus(null, "PENDING", 1099, 100)).thenReturn(
                produceProductStatus(quantity, (quantity <= 1200 ? quantity - 1100 : 100)));

        ProductsStatus result = loads.getPendingLoadedProducts();

        assertEquals(quantity, result.getSkus().size());
    }

    private ProductsStatus produceProductStatus(int totalRows, int quantity) {
        ProductsStatus productsStatus = new ProductsStatus();
        productsStatus.setSkus(new ArrayList<Sku>());
        productsStatus.setMetadata(new ArrayList<MetadataItem>());

        for (int i = 1; i <= quantity; i++) {
            productsStatus.getSkus().add(mock(Sku.class));
        }

        productsStatus.getMetadata().add(new MetadataItem("totalRows", String.valueOf(totalRows)));
        productsStatus.getMetadata().add(new MetadataItem("limit", "100"));

        return productsStatus;
    }
}