package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_Junkie_Elements {

    public E_Junkie_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "button[onclick=\"return EJProductClick('1595015')\"]")
    public WebElement addToCartBtn;

    @FindBy(css = "button[class=\"Apply-Button Show-Promo-Code-Button\"]")
    public WebElement addPromoCodeBtn;

    @FindBy(xpath = "//div[@id=\"root\"]//input[@name=\"cardnumber\"]")
    public WebElement cardNumberPlc;

    @FindBy(css = "input[placeholder=\"Promo Code\"]")
    public WebElement promoCodePlc;

    @FindBy(css = "button[class=\"Promo-Apply\"]")
    public WebElement promoCodeApplyBtn;

    @FindBy(css = "div[id=\"SnackBar\"] > span")
    public WebElement invalidPromoCodeTxt;

    @FindBy(css = "button[data-option=\"CC\"]")
    public WebElement payDebitBtn;

    @FindBy(css = "div[id=\"SnackBar\"] > span")
    public WebElement invalidPaymentDetailsTxt;

    @FindBy(css = "button[class=\"Pay-Button\"]")
    public WebElement payBtn;

    @FindBy(css = "input[placeholder=\"Email\"]")
    public WebElement emailPlc;

    @FindBy(css = "input[placeholder=\"Confirm Email\"]")
    public WebElement confirmEmailPlc;

    @FindBy(css = "input[placeholder=\"Name On Card\"]")
    public WebElement nameOnCardPlc;

    @FindBy(css = "div[id=\"SnackBar\"] > span")
    public WebElement invalidCardNumTxt;

    @FindBy(css = "p[class=\"confirme_text\"] > span")
    public WebElement orderConfirmMessage;

    @FindBy(linkText = "Download")
    public WebElement downloadBookBtn;

    @FindBy(css = "span[class=\"CardField-expiry CardField-child\"] input")
    public WebElement cardExpirationDate;

    @FindBy(css = "span[class=\"CardField-cvc CardField-child\"] input")
    public WebElement cardCVC;

    @FindBy(linkText = "E-junkie")
    public WebElement homePageBtn;


    // Contact Us Page
    @FindBy(linkText = "Contact Us")
    public WebElement contactUsBtn;

    @FindBy(id = "sender_name")
    public WebElement contactUsName;

    @FindBy(id = "sender_email")
    public WebElement contactUsEmail;

    @FindBy(id = "sender_subject")
    public WebElement contactUsSubject;

    @FindBy(id = "sender_message")
    public WebElement contactUsMessage;

    @FindBy(css = "div[class=\"recaptcha-checkbox-border\"]")
    public WebElement recaptchaBox;
    @FindBy(id = "recaptcha-verify-button")
    public WebElement recaptchaVerifyBtn;

    @FindBy(id = "send_message_button")
    public WebElement sendBtn;



    // IFRAME LOCATORS
    @FindBy(xpath = "//iframe[@class='EJIframeV3 EJOverlayV3']")
    public WebElement checkoutFrame;

    @FindBy(xpath = "//div[@class=\"Checkout-Options\"]//iframe")
    public WebElement cardNumPlcFrame;
    @FindBy(css = "iframe[title=\"reCAPTCHA\"]")
    public WebElement recaptchaFrame;
    @FindBy(css = "iframe[title=\"reCAPTCHA sorusunun süresi iki dakika sonra dolacak\"]")
    public WebElement recaptchaIMGFrame;



    // E-Junkie Wiki Site Locators
    @FindBy(linkText = "E-commerce by E-junkie")
    public WebElement eJunkieWikiSite;

    @FindBy(linkText = "See how it works")
    public WebElement seeHiwBtn;

    @FindBy(css = "iframe[width=\"853\"]")
    public WebElement videoFrame;
    @FindBy(css = "div[class=\"ytp-cued-thumbnail-overlay\"]")
    public WebElement playVideoBtn;



}
