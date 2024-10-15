// @generated by protoc-gen-connect-es v1.6.1 with parameter "target=ts"
// @generated from file xyz/block/ftl/v1beta1/provisioner/service.proto (package xyz.block.ftl.v1beta1.provisioner, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { CreateDeploymentRequest, CreateDeploymentResponse, GetArtefactDiffsRequest, GetArtefactDiffsResponse, GetSchemaRequest, GetSchemaResponse, PingRequest, PingResponse, PullSchemaRequest, PullSchemaResponse, ReplaceDeployRequest, ReplaceDeployResponse, StatusRequest, StatusResponse, UpdateDeployRequest, UpdateDeployResponse, UploadArtefactRequest, UploadArtefactResponse } from "../../v1/ftl_pb.js";
import { MethodIdempotency, MethodKind } from "@bufbuild/protobuf";

/**
 * @generated from service xyz.block.ftl.v1beta1.provisioner.ProvisionerService
 */
export const ProvisionerService = {
  typeName: "xyz.block.ftl.v1beta1.provisioner.ProvisionerService",
  methods: {
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.Ping
     */
    ping: {
      name: "Ping",
      I: PingRequest,
      O: PingResponse,
      kind: MethodKind.Unary,
      idempotency: MethodIdempotency.NoSideEffects,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.Status
     */
    status: {
      name: "Status",
      I: StatusRequest,
      O: StatusResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.GetArtefactDiffs
     */
    getArtefactDiffs: {
      name: "GetArtefactDiffs",
      I: GetArtefactDiffsRequest,
      O: GetArtefactDiffsResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.UploadArtefact
     */
    uploadArtefact: {
      name: "UploadArtefact",
      I: UploadArtefactRequest,
      O: UploadArtefactResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.CreateDeployment
     */
    createDeployment: {
      name: "CreateDeployment",
      I: CreateDeploymentRequest,
      O: CreateDeploymentResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.UpdateDeploy
     */
    updateDeploy: {
      name: "UpdateDeploy",
      I: UpdateDeployRequest,
      O: UpdateDeployResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.ReplaceDeploy
     */
    replaceDeploy: {
      name: "ReplaceDeploy",
      I: ReplaceDeployRequest,
      O: ReplaceDeployResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.GetSchema
     */
    getSchema: {
      name: "GetSchema",
      I: GetSchemaRequest,
      O: GetSchemaResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1beta1.provisioner.ProvisionerService.PullSchema
     */
    pullSchema: {
      name: "PullSchema",
      I: PullSchemaRequest,
      O: PullSchemaResponse,
      kind: MethodKind.ServerStreaming,
    },
  }
} as const;

