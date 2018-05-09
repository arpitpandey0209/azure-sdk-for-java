/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.logic.v2016_06_01.Versions;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggers;
import com.microsoft.azure.management.logic.v2016_06_01.Histories;
import com.microsoft.azure.management.logic.v2016_06_01.Runs;
import com.microsoft.azure.management.logic.v2016_06_01.Actions;
import com.microsoft.azure.management.logic.v2016_06_01.Repetitions;
import com.microsoft.azure.management.logic.v2016_06_01.ScopeRepetitions;
import com.microsoft.azure.management.logic.v2016_06_01.Operations;
import com.microsoft.azure.management.logic.v2016_06_01.Assemblies;
import com.microsoft.azure.management.logic.v2016_06_01.BatchConfigurations;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountSchemas;
import com.microsoft.azure.management.logic.v2016_06_01.Maps;
import com.microsoft.azure.management.logic.v2016_06_01.Partners;
import com.microsoft.azure.management.logic.v2016_06_01.Agreements;
import com.microsoft.azure.management.logic.v2016_06_01.Certificates;
import com.microsoft.azure.management.logic.v2016_06_01.Sessions;
import com.microsoft.azure.management.logic.v2016_06_01.VersionWorkflowTriggers;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowSchemas;
import com.microsoft.azure.management.logic.v2016_06_01.Workflows;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccounts;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Logic resource management.
 */
public final class LogicManager extends ManagerCore<LogicManager, LogicManagementClientImpl> {
    private Versions versions;
    private WorkflowTriggers workflowTriggers;
    private Histories histories;
    private Runs runs;
    private Actions actions;
    private Repetitions repetitions;
    private ScopeRepetitions scopeRepetitions;
    private Operations operations;
    private Assemblies assemblies;
    private BatchConfigurations batchConfigurations;
    private IntegrationAccountSchemas integrationAccountSchemas;
    private Maps maps;
    private Partners partners;
    private Agreements agreements;
    private Certificates certificates;
    private Sessions sessions;
    private VersionWorkflowTriggers versionWorkflowTriggers;
    private WorkflowSchemas workflowSchemas;
    private Workflows workflows;
    private IntegrationAccounts integrationAccounts;
    /**
    * Get a Configurable instance that can be used to create LogicManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new LogicManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of LogicManager that exposes Logic resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the LogicManager
    */
    public static LogicManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new LogicManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of LogicManager that exposes Logic resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the LogicManager
    */
    public static LogicManager authenticate(RestClient restClient, String subscriptionId) {
        return new LogicManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of LogicManager that exposes Logic management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Logic management API entry points that work across subscriptions
        */
        LogicManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Versions.
     */
    public Versions versions() {
        if (this.versions == null) {
            this.versions = new VersionsImpl(this);
        }
        return this.versions;
    }

    /**
     * @return Entry point to manage WorkflowTriggers.
     */
    public WorkflowTriggers workflowTriggers() {
        if (this.workflowTriggers == null) {
            this.workflowTriggers = new WorkflowTriggersImpl(this);
        }
        return this.workflowTriggers;
    }

    /**
     * @return Entry point to manage Histories.
     */
    public Histories histories() {
        if (this.histories == null) {
            this.histories = new HistoriesImpl(this);
        }
        return this.histories;
    }

    /**
     * @return Entry point to manage Runs.
     */
    public Runs runs() {
        if (this.runs == null) {
            this.runs = new RunsImpl(this);
        }
        return this.runs;
    }

    /**
     * @return Entry point to manage Actions.
     */
    public Actions actions() {
        if (this.actions == null) {
            this.actions = new ActionsImpl(this);
        }
        return this.actions;
    }

    /**
     * @return Entry point to manage Repetitions.
     */
    public Repetitions repetitions() {
        if (this.repetitions == null) {
            this.repetitions = new RepetitionsImpl(this);
        }
        return this.repetitions;
    }

    /**
     * @return Entry point to manage ScopeRepetitions.
     */
    public ScopeRepetitions scopeRepetitions() {
        if (this.scopeRepetitions == null) {
            this.scopeRepetitions = new ScopeRepetitionsImpl(this);
        }
        return this.scopeRepetitions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Assemblies.
     */
    public Assemblies assemblies() {
        if (this.assemblies == null) {
            this.assemblies = new AssembliesImpl(this);
        }
        return this.assemblies;
    }

    /**
     * @return Entry point to manage BatchConfigurations.
     */
    public BatchConfigurations batchConfigurations() {
        if (this.batchConfigurations == null) {
            this.batchConfigurations = new BatchConfigurationsImpl(this);
        }
        return this.batchConfigurations;
    }

    /**
     * @return Entry point to manage IntegrationAccountSchemas.
     */
    public IntegrationAccountSchemas integrationAccountSchemas() {
        if (this.integrationAccountSchemas == null) {
            this.integrationAccountSchemas = new IntegrationAccountSchemasImpl(this);
        }
        return this.integrationAccountSchemas;
    }

    /**
     * @return Entry point to manage Maps.
     */
    public Maps maps() {
        if (this.maps == null) {
            this.maps = new MapsImpl(this);
        }
        return this.maps;
    }

    /**
     * @return Entry point to manage Partners.
     */
    public Partners partners() {
        if (this.partners == null) {
            this.partners = new PartnersImpl(this);
        }
        return this.partners;
    }

    /**
     * @return Entry point to manage Agreements.
     */
    public Agreements agreements() {
        if (this.agreements == null) {
            this.agreements = new AgreementsImpl(this);
        }
        return this.agreements;
    }

    /**
     * @return Entry point to manage Certificates.
     */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(this);
        }
        return this.certificates;
    }

    /**
     * @return Entry point to manage Sessions.
     */
    public Sessions sessions() {
        if (this.sessions == null) {
            this.sessions = new SessionsImpl(this);
        }
        return this.sessions;
    }

    /**
     * @return Entry point to manage VersionWorkflowTriggers.
     */
    public VersionWorkflowTriggers versionWorkflowTriggers() {
        if (this.versionWorkflowTriggers == null) {
            this.versionWorkflowTriggers = new VersionWorkflowTriggersImpl(this);
        }
        return this.versionWorkflowTriggers;
    }

    /**
     * @return Entry point to manage WorkflowSchemas.
     */
    public WorkflowSchemas workflowSchemas() {
        if (this.workflowSchemas == null) {
            this.workflowSchemas = new WorkflowSchemasImpl(this);
        }
        return this.workflowSchemas;
    }

    /**
     * @return Entry point to manage Workflows.
     */
    public Workflows workflows() {
        if (this.workflows == null) {
            this.workflows = new WorkflowsImpl(this);
        }
        return this.workflows;
    }

    /**
     * @return Entry point to manage IntegrationAccounts.
     */
    public IntegrationAccounts integrationAccounts() {
        if (this.integrationAccounts == null) {
            this.integrationAccounts = new IntegrationAccountsImpl(this);
        }
        return this.integrationAccounts;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public LogicManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return LogicManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private LogicManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new LogicManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}