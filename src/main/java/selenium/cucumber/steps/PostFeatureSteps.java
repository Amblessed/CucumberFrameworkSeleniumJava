package selenium.cucumber.steps;

import io.cucumber.java.en.*;

public class PostFeatureSteps {

    @Given("The User is logged into his facebook account")
    public void the_User_is_logged_into_his_facebook_account()
    {
        System.out.println("the_User_is_logged_into_his_facebook_account");
    }

    @Given("The user is present on his own wall")
    public void the_user_is_present_on_his_own_wall()
    {
        System.out.println("the_user_is_present_on_his_own_wall");
    }

    @When("The user types a message in the text box")
    public void the_user_types_a_message_in_the_text_box()
    {
        System.out.println("the_user_types_a_message_in_the_text_box");
    }

    @When("Clicks the post button")
    public void clicks_the_post_button()
    {
        System.out.println("clicks_the_post_button");
    }

    @Then("The message should get posted")
    public void the_message_should_get_posted()
    {
        System.out.println("the_message_should_get_posted");
    }

    @When("The user enters a youtube link in the text box")
    public void the_user_enters_a_youtube_link_in_the_text_box()
    {
        System.out.println("the_user_enters_a_youtube_link_in_the_text_box");
    }

    @Then("The video should be posted on the user wall")
    public void the_video_should_be_posted_on_the_user_wall()
    {
        System.out.println("the_video_should_be_posted_on_the_user_wall");
    }

    @Then("the video should have a proper thumbnail")
    public void the_video_should_have_a_proper_thumbnail()
    {
        System.out.println("the_video_should_have_a_proper_thumbnail");
    }

}
