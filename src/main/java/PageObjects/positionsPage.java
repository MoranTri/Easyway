package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class positionsPage
{
    @FindBy(how = How.CSS, using = "h2")
    public WebElement txt_positionPageTitle;

    @FindBy(how = How.LINK_TEXT, using = "QA Automation")
    public WebElement btn_QAAutomationPosition;

    @FindBy(how = How.ID, using = "first_name")
    public WebElement input_firstName;

    @FindBy(how = How.ID, using = "last_name")
    public WebElement input_lastName;

    @FindBy(how = How.ID, using = "email")
    public WebElement input_email;

    @FindBy(how = How.ID, using = "phone")
    public WebElement input_phone;

    @FindBy(how = How.ID, using = "job_application_location")
    public WebElement input_city;

    @FindBy(how = How.XPATH, using = "//div[@data-field='cover_letter']//a[@data-source='paste']")
    public WebElement btn_coverLetterPaste;

    @FindBy(how = How.ID, using = "cover_letter_text")
    public WebElement input_coverLetter;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_0_text_value")
    public WebElement input_linkedinProfileLink;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_1_text_value")
    public WebElement input_websiteLink;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_2_text_value")
    public WebElement input_question;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_3_answer_selected_options_attributes_0_question_option_id")
    public WebElement checkbox_java;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_3_answer_selected_options_attributes_3_question_option_id")
    public WebElement checkbox_manualTesting;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_3_answer_selected_options_attributes_4_question_option_id")
    public WebElement checkbox_automationTesting;

    @FindBy(how = How.ID, using = "job_application_answers_attributes_3_answer_selected_options_attributes_5_question_option_id")
    public WebElement checkbox_selenium;
}
