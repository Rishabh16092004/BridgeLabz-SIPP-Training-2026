interface CouponValidator{
    void ValidateCoupon(String code);
    static boolean IsLengthValid(String code){
        return code.length()>=5;
    }
}
class ShoppingCart implements CouponValidator{
    @Override
    public void ValidateCoupon(String code) {
        if(CouponValidator.IsLengthValid(code) && code.startsWith("AAA")){
            System.out.println("Your coupon code is valid");
        }
        else{
            System.out.println("Your coupon code is invalid");
        }
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {
        String[] coupons = {"AAA10","AAA11","AAA1","AAB111","AAA12"};
        ShoppingCart cart = new ShoppingCart();
        for(String code : coupons){
            cart.ValidateCoupon(code);
        }
    }
}
