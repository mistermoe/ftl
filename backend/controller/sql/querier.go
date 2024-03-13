// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.25.0

package sql

import (
	"context"
	"time"

	"github.com/TBD54566975/ftl/internal/model"
	"github.com/alecthomas/types/optional"
)

type Querier interface {
	AssociateArtefactWithDeployment(ctx context.Context, arg AssociateArtefactWithDeploymentParams) error
	// Create a new artefact and return the artefact ID.
	CreateArtefact(ctx context.Context, digest []byte, content []byte) (int64, error)
	CreateDeployment(ctx context.Context, name model.DeploymentName, moduleName string, schema []byte) error
	CreateIngressRequest(ctx context.Context, origin Origin, name string, sourceAddr string) error
	CreateIngressRoute(ctx context.Context, arg CreateIngressRouteParams) error
	DeregisterRunner(ctx context.Context, key model.RunnerKey) (int64, error)
	ExpireRunnerReservations(ctx context.Context) (int64, error)
	GetActiveDeploymentSchemas(ctx context.Context) ([]GetActiveDeploymentSchemasRow, error)
	GetActiveDeployments(ctx context.Context, all bool) ([]GetActiveDeploymentsRow, error)
	GetActiveRunners(ctx context.Context, all bool) ([]GetActiveRunnersRow, error)
	GetAllIngressRoutes(ctx context.Context, all bool) ([]GetAllIngressRoutesRow, error)
	GetArtefactContentRange(ctx context.Context, start int32, count int32, iD int64) ([]byte, error)
	// Return the digests that exist in the database.
	GetArtefactDigests(ctx context.Context, digests [][]byte) ([]GetArtefactDigestsRow, error)
	GetControllers(ctx context.Context, all bool) ([]Controller, error)
	GetDeployment(ctx context.Context, name model.DeploymentName) (GetDeploymentRow, error)
	// Get all artefacts matching the given digests.
	GetDeploymentArtefacts(ctx context.Context, deploymentID int64) ([]GetDeploymentArtefactsRow, error)
	GetDeploymentsByID(ctx context.Context, ids []int64) ([]Deployment, error)
	// Get deployments that have a mismatch between the number of assigned and required replicas.
	GetDeploymentsNeedingReconciliation(ctx context.Context) ([]GetDeploymentsNeedingReconciliationRow, error)
	// Get all deployments that have artefacts matching the given digests.
	GetDeploymentsWithArtefacts(ctx context.Context, digests [][]byte, schema []byte, count int64) ([]GetDeploymentsWithArtefactsRow, error)
	GetExistingDeploymentForModule(ctx context.Context, name string) (GetExistingDeploymentForModuleRow, error)
	GetIdleRunners(ctx context.Context, labels []byte, limit int64) ([]Runner, error)
	// Get the runner endpoints corresponding to the given ingress route.
	GetIngressRoutes(ctx context.Context, method string) ([]GetIngressRoutesRow, error)
	GetModulesByID(ctx context.Context, ids []int64) ([]Module, error)
	GetProcessList(ctx context.Context) ([]GetProcessListRow, error)
	// Retrieve routing information for a runner.
	GetRouteForRunner(ctx context.Context, key model.RunnerKey) (GetRouteForRunnerRow, error)
	GetRoutingTable(ctx context.Context, modules []string) ([]GetRoutingTableRow, error)
	GetRunner(ctx context.Context, key model.RunnerKey) (GetRunnerRow, error)
	GetRunnerState(ctx context.Context, key model.RunnerKey) (RunnerState, error)
	GetRunnersForDeployment(ctx context.Context, name model.DeploymentName) ([]GetRunnersForDeploymentRow, error)
	InsertCallEvent(ctx context.Context, arg InsertCallEventParams) error
	InsertDeploymentCreatedEvent(ctx context.Context, arg InsertDeploymentCreatedEventParams) error
	InsertDeploymentUpdatedEvent(ctx context.Context, arg InsertDeploymentUpdatedEventParams) error
	InsertEvent(ctx context.Context, arg InsertEventParams) error
	InsertLogEvent(ctx context.Context, arg InsertLogEventParams) error
	// Mark any controller entries that haven't been updated recently as dead.
	KillStaleControllers(ctx context.Context, timeout time.Duration) (int64, error)
	KillStaleRunners(ctx context.Context, timeout time.Duration) (int64, error)
	ReplaceDeployment(ctx context.Context, oldDeployment string, newDeployment string, minReplicas int32) (int64, error)
	// Find an idle runner and reserve it for the given deployment.
	ReserveRunner(ctx context.Context, reservationTimeout time.Time, deploymentName model.DeploymentName, labels []byte) (Runner, error)
	SetDeploymentDesiredReplicas(ctx context.Context, name model.DeploymentName, minReplicas int32) error
	UpsertController(ctx context.Context, key model.ControllerKey, endpoint string) (int64, error)
	UpsertModule(ctx context.Context, language string, name string) (int64, error)
	// Upsert a runner and return the deployment ID that it is assigned to, if any.
	// If the deployment name is null, then deployment_rel.id will be null,
	// otherwise we try to retrieve the deployments.id using the key. If
	// there is no corresponding deployment, then the deployment ID is -1
	// and the parent statement will fail due to a foreign key constraint.
	UpsertRunner(ctx context.Context, arg UpsertRunnerParams) (optional.Option[int64], error)
}

var _ Querier = (*Queries)(nil)
