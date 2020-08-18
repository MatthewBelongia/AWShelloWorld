/**
 * This code was generated from {@link com.amazonaws.samples.helloWorldWorkflow.GreeterWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package com.amazonaws.samples.helloWorldWorkflow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

public interface GreeterWorkflowClient extends WorkflowClient
{
    Promise<Void> greet();
    Promise<Void> greet(Promise<?>... waitFor);
    Promise<Void> greet(StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}