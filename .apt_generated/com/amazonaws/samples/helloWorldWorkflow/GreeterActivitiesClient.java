/**
 * This code was generated from {@link com.amazonaws.samples.helloWorldWorkflow.GreeterActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package com.amazonaws.samples.helloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface GreeterActivitiesClient extends ActivitiesClient
{
    Promise<java.lang.String> getName();
    Promise<java.lang.String> getName(Promise<?>... waitFor);
    Promise<java.lang.String> getName(ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.String> getGreeting(java.lang.String name);
    Promise<java.lang.String> getGreeting(java.lang.String name, Promise<?>... waitFor);
    Promise<java.lang.String> getGreeting(java.lang.String name, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<java.lang.String> getGreeting(Promise<java.lang.String> name);
    Promise<java.lang.String> getGreeting(Promise<java.lang.String> name, Promise<?>... waitFor);
    Promise<java.lang.String> getGreeting(Promise<java.lang.String> name, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Void> say(java.lang.String what);
    Promise<Void> say(java.lang.String what, Promise<?>... waitFor);
    Promise<Void> say(java.lang.String what, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Void> say(Promise<java.lang.String> what);
    Promise<Void> say(Promise<java.lang.String> what, Promise<?>... waitFor);
    Promise<Void> say(Promise<java.lang.String> what, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}