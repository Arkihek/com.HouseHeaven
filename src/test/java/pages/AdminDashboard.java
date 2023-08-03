package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard() {


        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminEMail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement adminPassword;

    @FindBy(xpath = "//*[@class='signin']")
    public WebElement adminSignIn;

    @FindBy(xpath = "//*[@name='remember']")
    public WebElement adminRemember;
    @FindBy(xpath = "(//*[@class='dropdown-toggle dropdown-header-name'])[3]")
    public WebElement adminGirisKontrol;

    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[2]")
    public WebElement blog;

    @FindBy(xpath = "//*[@id='cms-plugins-blog']")
    public WebElement blogBasligindakiler;


    // Admin DashBoard Giris

    @FindBy(xpath = "//input[@placeholder='Email/Username']")
    public WebElement adminUsername;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement adminPasswordd;


    @FindBy(xpath = "//span[@class='signin']")
    public WebElement AdminSigninButon;


    @FindBy(xpath = "(//span[@class='title'])[4]")
    public WebElement realEstate;

    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElement realEstateProperties;

    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement yukklenenIlanIDAdminEdit;

    @FindBy(xpath = "//span[@id='select2-moderation_status-container']")
    public WebElement moderationStatus;

    @FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
    public WebElement adminModernStatusUstuSaveExit;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement pendingAprowed;

    // PAYMENTS BOLUMU
    @FindBy(xpath = "(//*[@class='nav-link nav-toggle'])[10]")
    public WebElement paymentsButton;

    @FindBy(xpath = "(//*[@class='nav-link'])[9]")
    public WebElement transactionsButton;

    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[1]")
    public WebElement paymentsPayerName1;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[2]")
    public WebElement paymentsPayerName2;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[3]")
    public WebElement paymentsPayerName3;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[4]")
    public WebElement paymentsPayerName4;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[5]")
    public WebElement paymentsPayerName5;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[6]")
    public WebElement paymentsPayerName6;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[7]")
    public WebElement paymentsPayerName7;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[8]")
    public WebElement paymentsPayerName8;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[9]")
    public WebElement paymentsPayerName9;
    @FindBy(xpath = "(//*[@class=' text-start column-key-customer_id'])[10]")
    public WebElement paymentsPayerName10;
    @FindBy(xpath = "(//*[@class='nav-item '])[1]")
    public WebElement dashboardButton;


    @FindBy(xpath = "(//*[@class='nav-link'])[1]")
    public WebElement dashboardPosts;

    // MEDIA BOLUMU
    @FindBy(xpath = "(//*[@class='title'])[12]")
    public WebElement mediaButton;
    @FindBy(xpath = "//*[@class='btn btn-success js-dropzone-upload dz-clickable']")
    public WebElement uploadButton;
    @FindBy(xpath = "//*[@class='btn btn-success js-download-action']")
    public WebElement downloadButton;
    @FindBy(xpath = "//*[@class='btn btn-success js-create-folder-action']")
    public WebElement createFolderButton;
    @FindBy(xpath = "//*[@class='btn btn-success js-change-action']")
    public WebElement refreshButton;
    @FindBy(xpath = "//*[@class='btn btn-success dropdown-toggle js-rv-media-change-filter-group js-filter-by-type']")
    public WebElement filterButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[8]")
    public WebElement filterEverythingButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[9]")
    public WebElement filterImageButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[10]")
    public WebElement filterVideoButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[11]")
    public WebElement filterDocumentButton;
    @FindBy(xpath = "(//*[@class='fa fa-eye'])")
    public WebElement wiewInButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[12]")
    public WebElement wiewInAllMediaButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[13]")
    public WebElement wiewInTrashButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[14]")
    public WebElement wiewInRecentButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[15]")
    public WebElement wiewInFavoriteButton;
    @FindBy(xpath = "(//*[@class='btn btn-secondary dropdown-toggle'])[1]")
    public WebElement shortButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[16]")
    public WebElement shortfileNameASCButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[17]")
    public WebElement shortfileNameDESCButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[18]")
    public WebElement shortUploadedASCButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[19]")
    public WebElement shortUploadedDESCButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[20]")
    public WebElement shortSizeASCButton;
    @FindBy(xpath = "(//*[@class='js-rv-media-change-filter'])[21]")
    public WebElement shortSizeDESCButton;
    @FindBy(xpath = "(//*[@class='btn btn-secondary dropdown-toggle'])[2]")
    public WebElement actionsButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[1]")
    public WebElement actionsPreviewButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[2]")
    public WebElement actionsCropButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[3]")
    public WebElement actionsCopyLinkButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[4]")
    public WebElement actionsMakeCopyButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[5]")
    public WebElement actionsAllTextButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[6]")
    public WebElement actionsAddFavoriteButton;
    @FindBy(xpath = "(//*[@class='js-files-action'])[7]")
    public WebElement actionsDownloadButton;
    @FindBy(xpath = "//*[@class='btn btn-secondary active']")
    public WebElement wiewSelect1Button;
    @FindBy(xpath = "(//*[@class='btn btn-secondary'])[1]")
    public WebElement wiewSelect2Button;
    @FindBy(xpath = "(//*[@class='rv-media-item'])[2]")
    public WebElement mediaList;

    //user name is located on admin log in page
    @FindBy(xpath = "//*[@name='username']")
    public WebElement textBoxAdminUserNameOnLogInPage;

    //password is located on admin log in page
    @FindBy(xpath = "//*[@name='password']")
    public WebElement textBoxAdminPassword;

    //login button is located on admin log in page
    @FindBy(xpath = "//*[@class='btn btn-block login-button']")
    public WebElement adminLogInButton;

    //admin dashboard button is based on slide bar in admin page
    @FindBy(xpath = "//*[@id='cms-core-dashboard']/a")
    public WebElement adminDasboardButton;

    //active properties Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[1]")
    public WebElement activePropertiesButton;

    //pending properties Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[2]")
    public WebElement pendingPropertiesButton;

    //expired properties Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[3]")
    public WebElement expiredPropertiesButton;

    //agents Button is based on body in admin page
    @FindBy(xpath = "(//*[@class='desc'])[4]")
    public WebElement agentsButton;

    //agents Button is based on body in admin page
    @FindBy(xpath = "//*[@class='no-sort column-key-updated_at sorting_disabled']")
    public WebElement labelNumberOfRealEstate;

    //This button is based on admin header
    @FindBy(xpath = "//*[@class='d-none d-sm-inline']")
    public WebElement viewWebsiteButton;

    //This button is based on left side of header
    @FindBy(xpath = "//div[@class='page-logo']")
    public WebElement sideBarButton;

    //This button that shows us notification is based on right side of header
    @FindBy(xpath = "//*[@class='fas fa-bell']")
    public WebElement notificationButton;

    //This Text that shows us notifications is based inside of notification on right side of header
    @FindBy(xpath = "//h5[text()='No notifications here']")
    public WebElement LabelNotificationsHereText;

    //This button that shows us Admin features is based on right side of header
    @FindBy(xpath = "//*[@class='fa fa-angle-down']")
    public WebElement adminFeaturesButton;

    //This button that goes us Admin profile is based inside of admin features on right side of header
    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/admin/system/users/profile/5']")
    public WebElement adminProfileButton;

    //This button that shows us Admin information is located on admin profile page
    @FindBy(xpath = "//*[@class='nav-link active']")
    public WebElement adminUserProfileButton;

    //This button that shows us Admin first name is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement textBoxAdminFirstName;

    //This button that shows us Admin last name is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement textBoxAdminLastName;

    //This button that shows us Admin user name is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement textBoxAdminUserName;

    //This button that shows us Admin email is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement textBoxAdminEmail;

    //This button that shows us Admin password information is located on admin profile page
    @FindBy(xpath = "//*[@href='#tab_1_3']")
    public WebElement adminChangePasswordButton;

    //This button that shows us Admin password information is located on admin profile page
    @FindBy(xpath = "(//input[@class='form-control'])[7]")
    public WebElement textBoxAdminConfirmNewPassword;

    //This button that update us Admin password information is located on admin profile page
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement adminUpdateNewPasswordButton;

    //This button that log out us from admin page
    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/admin/logout']")
    public WebElement adminLogOutButton;

    //This button that goes us to blog button is located inside of left side bar
    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement blogButton;

    //This button that goes us to post button is located inside of blog button
    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement postButton;

    //This button that goes us to post button is located inside of blog button
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement categoriesButton;

    //This button that goes us to post button is located inside of blog button
    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public WebElement tagsButton;

    // blog-posts-create
    @FindBy(xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement blogPostCreateButton;

    // create posts verify text
    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement labelCreatePostVerifyText;

    // blog/edit/name textbox
    @FindBy(xpath = "//input[@id='name']")
    public WebElement textBoxBlogPostName;

    // blog/edit/description text area
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement textBoxBlogPostDescription;

    // blog/edit/content text area
    @FindBy(xpath = "//*[@role='textbox']")
    public WebElement textBoxBlogPostContent;

    //(blog/edit/save-exit button)
    @FindBy(xpath = "(//button[@name='submit'])[1]")
    public WebElement blogPostSaveExitButton;

    //(blog/edit/save button)
    @FindBy(xpath = "(//button[@name='submit'])[2]")
    public WebElement blogPostSaveButton;

    // (blog/posts/delete button)
    @FindBy(xpath = "(//a[@data-bs-original-title='Delete'])[1]")
    public WebElement blogPostDeleteButton;

    // (blog/posts/delete confirm button)
    @FindBy(xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement blogPostDeleteConfirmButton;

    //  (blog/posts/ delete confirm message text)
    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement labelBlogPostDeleteConfirm;

    //categories text is on categories body in catergories page
    @FindBy(xpath = "(//li[@class='breadcrumb-item active'])[1]")
    public WebElement labelCategories;

    //Create button is based on categories body in the page
    @FindBy(xpath = "//*[text()=' Create                            ']")
    public WebElement categoriesCrateButton;

    //Editigin text is basd on categories body in the page
    @FindBy(xpath = "//*[@class='note note-success']")
    public WebElement labelEditing;

    //This is a delete button for Latest News file on based near the file in categories page
    @FindBy(xpath = "(//*[@class='btn btn-icon btn-danger deleteDialog'])[1]")
    public WebElement categoriesDeleteButton;

    // place holder is for name textbox in categories page
    @FindBy(xpath = "//*[@placeholder='Name']")
    public WebElement textBoxCategoryName;

    //select box is for parent in categories page
    @FindBy(xpath = "//*[@name='parent_id']")
    public WebElement textBoxCategorySelectParent;

    //description textarea is for create categories in categories page
    @FindBy(xpath = "(//*[@name='description'])[2]")
    public WebElement textBoxCategoryDescription;

    //switch button is for is default text on create categories
    @FindBy(xpath = "(//*[@class='onoffswitch-switch'])[1]")
    public WebElement categoryDefaultSwitchButton;

    //switch button is for is featured text on create categories
    @FindBy(xpath = "(//*[@class='onoffswitch-switch'])[2]")
    public WebElement categoryFeaturedSwitchButton;

    //text box is for icon on create categories
    @FindBy(xpath = "//*[@name='icon']")
    public WebElement textBoxCategoryIcon;

    //number box is for order on create categories
    @FindBy(xpath = "//*[@name='order']")
    public WebElement textBoxCategoryOrder;

    //select box is for status on create categories
    @FindBy(xpath = "//*[@name='status']")
    public WebElement textBoxCategorySelectStatus;

    //save&exit button is for publis on create categories
    @FindBy(xpath = "(//*[@value='save'])[1]")
    public WebElement saveExitButton;

    //save button is for publis on create categories
    @FindBy(xpath = "(//*[@value='apply'])[1]")
    public WebElement saveButton;

    //This the success message is for both delete and create buttons in categories page
    @FindBy(xpath = "//*[@class='toast toast-success']")
    public WebElement labelSuccessMessage;

    //Dashboard/blogs/tags/create button
    @FindBy(xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement tagsCrateButton;

    //Dashboard/testimonialsButton
    @FindBy(xpath = "//*[@id='cms-plugins-testimonial']")
    public WebElement testimonialsButton;

    //Dashboard/testimonialsButton/Records
    @FindBy(xpath = "//span[@class='dt-length-records']")
    public WebElement labelTestimonialsRecords;

    //Dashboard/testimonialsButton/Create
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement testimonialsCreateButton;

    //Dashboard/testimonialsButton/Create/position/CompanyInput
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement textBoxCompanyInput;

    //Dashboard/testimonialsButton/Create/SaveButton
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement testimonialsCreateSaveButton;

    //Dashboard/testimonialsButton/Create/Save&ExitButton
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement testimonialsSaveButton;

    //Dashboard/testimonialsButton/Delete
    @FindBy(xpath = "(//*[@data-bs-original-title='Delete'])[9]")
    public WebElement testimonialsDeleteButton;

    //Dashboard/testimonialsButton/edit
    @FindBy(xpath = "(//*[@class='fa fa-edit'])[10]")
    public WebElement testimonialsEditButton;

    //Dashboard/testimonialsButton/delete/confirmDelete
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement testimonialsConfirmDeleteButton;

    //Dashboard/testimonialsButton/delete/confirmDelete/successfullDelete
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement labelSuccessfull;


    @FindBy(xpath = "(//*[@class='nav-link'])[2]")
    public WebElement dashboardCatagories;

    @FindBy(xpath = "(//*[@class='nav-link'])[3]")
    public  WebElement dashboardTags;

    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement postCreate;

    @FindBy(xpath = "//*[@class='btn btn-secondary buttons-collection dropdown-toggle buttons-export']")
    public WebElement postExportButton;

    @FindBy(xpath = "//*[@class='btn btn-secondary buttons-reload']")
    public WebElement postReoledButton;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement postCreateName;

    @FindBy(xpath = "(//textarea[@class='form-control'])[1]")
    public WebElement postDescription;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement postParagraf;

    @FindBy(xpath = "(//button[@name='submit'])[1]")
    public WebElement postSaveExit;

    @FindBy(xpath = "(//button[@name='submit'])[2]")
    public WebElement postSave;

    @FindBy(xpath = "(//*[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement postUpdate;

    @FindBy(xpath = "(//*[@data-bs-original-title='Delete'])[1]")
    public WebElement postDelete;

    @FindBy(xpath = "//*[@name='status']")
    public WebElement postStatus;

    @FindBy(xpath = "(//*[@type='checkbox'])[3]")
    public WebElement postCatagories;

    @FindBy(xpath  ="(//*[@class='float-end btn btn-danger delete-crud-entry'])[1]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement catagoriesName;

    @FindBy(xpath = "//*[@class='select2-selection__rendered']")
    public WebElement catagoriesParent;

    @FindBy(xpath = "(//*[@class='form-control is-valid'])[2]")
    public WebElement catagoriesDescription;

    @FindBy(xpath = "(//*[@class='form-control is-valid'])[3]")
    public WebElement catagoriesOrder;

    @FindBy(xpath = "(//*[@class='form-control'])[4]")
    public WebElement catagoriesIcon;

    @FindBy(xpath = "(//*[@class='btn btn-info'])[1]")
    public WebElement catagoriesSaveExit;

    @FindBy(id="select2-parent_id-result-ltip-1")
    public WebElement catagoriesParentSelect2;


    @FindBy(xpath = "(//*[@class='select2-results__option select2-results__option--selectable'])[1]")
    public WebElement catagoriesParentSelect;

    @FindBy(xpath = "(//*[@class='datatables__info_wrap'])")
    public WebElement tagsRecordSayi;

    @FindBy(xpath = "//*[@class='column-key-id sorting_1']")
    public WebElement tagsOrnek;

    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement tagsCreate;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement tagsDescription;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement tagsName;

    @FindBy(xpath = "(//*[@name='submit'])[2]")
    public WebElement tagsSave;

    @FindBy(xpath = "(//*[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement tagsUpdate;

    @FindBy(xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement tagsDelete;

    @FindBy(xpath = "(//*[@class='float-end btn btn-danger delete-crud-entry'])[1]")
    public WebElement tagsDeleteOnay;
}


