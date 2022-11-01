package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job = new Job();
        Job anotherJob = new Job();
        Assert.assertNotEquals(job.getId(),anotherJob.getId());
    }
   @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester",new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(job instanceof Job);
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals(job.getName(),"Product tester");
        Assert.assertEquals(job.getEmployer().getValue(),"ACME");
        Assert.assertEquals(job.getLocation().getValue(),"Desert");
        Assert.assertEquals(job.getPositionType().getValue(),"Quality control");
        Assert.assertEquals(job.getCoreCompetency().getValue(),"Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job job = new Job("Product tester",new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job anotherJob =  new Job("Product tester",new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(job.equals(anotherJob));

    }
}
