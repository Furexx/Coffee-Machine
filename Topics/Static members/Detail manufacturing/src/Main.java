class ManufacturingController {

    static int productNum = 0;
    public static String requestProduct(String product) {
        // write your code here
        productNum++;
       return String.format("%d. Requested %s",productNum,product);
    }

    public static int getNumberOfProducts() {
        // write your code here
        return productNum;
    }
}