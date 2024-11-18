// @generated by protoc-gen-connect-es v1.6.1 with parameter "target=ts"
// @generated from file xyz/block/ftl/v1/console/console.proto (package xyz.block.ftl.v1.console, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { PingRequest, PingResponse } from "../ftl_pb.js";
import { MethodIdempotency, MethodKind } from "@bufbuild/protobuf";
import { EventsQuery, GetConfigRequest, GetConfigResponse, GetEventsResponse, GetModulesRequest, GetModulesResponse, GetSecretRequest, GetSecretResponse, SetConfigRequest, SetConfigResponse, SetSecretRequest, SetSecretResponse, StreamEventsRequest, StreamEventsResponse, StreamModulesRequest, StreamModulesResponse } from "./console_pb.js";

/**
 * @generated from service xyz.block.ftl.v1.console.ConsoleService
 */
export const ConsoleService = {
  typeName: "xyz.block.ftl.v1.console.ConsoleService",
  methods: {
    /**
     * Ping service for readiness.
     *
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.Ping
     */
    ping: {
      name: "Ping",
      I: PingRequest,
      O: PingResponse,
      kind: MethodKind.Unary,
      idempotency: MethodIdempotency.NoSideEffects,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.GetModules
     */
    getModules: {
      name: "GetModules",
      I: GetModulesRequest,
      O: GetModulesResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.StreamModules
     */
    streamModules: {
      name: "StreamModules",
      I: StreamModulesRequest,
      O: StreamModulesResponse,
      kind: MethodKind.ServerStreaming,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.StreamEvents
     */
    streamEvents: {
      name: "StreamEvents",
      I: StreamEventsRequest,
      O: StreamEventsResponse,
      kind: MethodKind.ServerStreaming,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.GetEvents
     */
    getEvents: {
      name: "GetEvents",
      I: EventsQuery,
      O: GetEventsResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.GetConfig
     */
    getConfig: {
      name: "GetConfig",
      I: GetConfigRequest,
      O: GetConfigResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.SetConfig
     */
    setConfig: {
      name: "SetConfig",
      I: SetConfigRequest,
      O: SetConfigResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.GetSecret
     */
    getSecret: {
      name: "GetSecret",
      I: GetSecretRequest,
      O: GetSecretResponse,
      kind: MethodKind.Unary,
    },
    /**
     * @generated from rpc xyz.block.ftl.v1.console.ConsoleService.SetSecret
     */
    setSecret: {
      name: "SetSecret",
      I: SetSecretRequest,
      O: SetSecretResponse,
      kind: MethodKind.Unary,
    },
  }
} as const;

