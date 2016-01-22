package my.sample.androidmeetup;

import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class SampleTest extends ApplicationTestCase<Sample> {

    private Sample gsApp;

    public SampleTest() {
        super(Sample.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        createApplication();

        gsApp = getApplication();
    }

}