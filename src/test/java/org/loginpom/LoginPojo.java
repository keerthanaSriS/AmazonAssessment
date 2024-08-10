package org.loginpom;

import org.lib.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
		public LoginPojo() {
			PageFactory.initElements(driver, this);
			}
		@FindBy(id="emai")
		private WebElement txtUser;

		@FindBy(xpath="//span[text()='Hello, sign in']")
		private WebElement signIn;

		@FindBy(xpath="//input[@type='email']")
		private WebElement phNum;
		
		
		@FindBy(xpath="(//span[@class='a-button-inner'])[2]")
		private WebElement phNumClick;

		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		

		@FindBy(xpath="(//span[@class='a-button-inner'])[1]/input[@id='signInSubmit']")
		private WebElement passClick;

		@FindBy(xpath="//div[@class='nav-search-field ']//input[@type='text']")
		private WebElement Mobile;
		
		

		@FindBy(xpath="(//div[@class='nav-right'])[1]//input[@type='submit']")
		private WebElement SearchBtn;

		@FindBy(xpath="(//span[@class='a-list-item'])[3]//span[text()='Electronics']")
		private WebElement Electronics;
		


		@FindBy(xpath="(//div[@id='nav-progressive-subnav']//span[@class='nav-a-content'])[2]")
		private WebElement MouseHover;

		@FindBy(xpath="(//div[@class='a-section octopus-pc-asin-title'])[2]")
		private WebElement Product;
		
		
		@FindBy(xpath="//span[@id='submit.add-to-cart']")
		private WebElement aadToCart;


		public WebElement getTxtUser() {
			return txtUser;
		}


		public void setTxtUser(WebElement txtUser) {
			this.txtUser = txtUser;
		}


		public WebElement getSignIn() {
			return signIn;
		}


		public void setSignIn(WebElement signIn) {
			this.signIn = signIn;
		}


		public WebElement getPhNum() {
			return phNum;
		}


		public void setPhNum(WebElement phNum) {
			this.phNum = phNum;
		}


		public WebElement getPhNumClick() {
			return phNumClick;
		}


		public void setPhNumClick(WebElement phNumClick) {
			this.phNumClick = phNumClick;
		}


		public WebElement getPassword() {
			return password;
		}


		public void setPassword(WebElement password) {
			this.password = password;
		}


		public WebElement getPassClick() {
			return passClick;
		}


		public void setPassClick(WebElement passClick) {
			this.passClick = passClick;
		}


		public WebElement getMobile() {
			return Mobile;
		}


		public void setMobile(WebElement mobile) {
			Mobile = mobile;
		}


		public WebElement getSearchBtn() {
			return SearchBtn;
		}


		public void setSearchBtn(WebElement searchBtn) {
			SearchBtn = searchBtn;
		}


		public WebElement getElectronics() {
			return Electronics;
		}


		public void setElectronics(WebElement electronics) {
			Electronics = electronics;
		}


		public WebElement getMouseHover() {
			return MouseHover;
		}


		public void setMouseHover(WebElement mouseHover) {
			MouseHover = mouseHover;
		}


		public WebElement getProduct() {
			return Product;
		}


		public void setProduct(WebElement product) {
			Product = product;
		}


		public WebElement getAadToCart() {
			return aadToCart;
		}


		public void setAadToCart(WebElement aadToCart) {
			this.aadToCart = aadToCart;
		}
		

		

}