/*
 * Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.eclipse.lambda;

import com.amazonaws.eclipse.core.ui.WebLinkListener;

public class UrlConstants {

    public static final String LAMBDA_JAVA_HANDLER_DOC_URL = "https://docs.aws.amazon.com/lambda/latest/dg/programming-model.html";
    public static final String LAMBDA_EXECUTION_ROLE_DOC_URL = "https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role";
    public static final String LAMBDA_REQUEST_HANDLER_DOC_URL = "https://docs.aws.amazon.com/lambda/latest/dg/java-programming-model-req-resp.html";
    public static final String LAMBDA_STREAM_REQUEST_HANDLER_DOC_URL = "https://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-stream.html";

    public static final WebLinkListener webLinkListener = new WebLinkListener();

}
