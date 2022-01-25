package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();//for access to web element

    @Then("Account Summary page should have the following account types")//List STRING yaptim cunku pipline im var.
    public void account_Summary_page_should_have_the_following_account_types(List<String> expectedAccountTypes) {


        /**This method accepts a List<WebElements> and returns List<String> from browserUtils*/
        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountSummaryPage.accountTypes);

        //Asserting Result
        Assert.assertEquals("Account types does not match",expectedAccountTypes,actualAccountTypes);



    }

    @Then("Credit Accounts table must have these columns")
    public void credit_Accounts_table_must_have_these_columns(List<String> expectedColumns) {

        List<String> actualColumns = BrowserUtils.getElementsText(accountSummaryPage.actualColumnNames);


        Assert.assertEquals("Column names do not match", expectedColumns,actualColumns);


    }


}
