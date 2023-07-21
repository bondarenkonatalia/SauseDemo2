package tests;

import org.testng.annotations.Test;

public class InventoriTest extends BaseTest{
    @Test
    public void goToCart(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.addItemInCartByItemName("Sauce Labs Backpack");
    }
}
