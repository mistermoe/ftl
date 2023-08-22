// Copyright 2019, OpenTelemetry Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// @generated by protoc-gen-connect-es v0.13.0 with parameter "target=ts"
// @generated from file opentelemetry/proto/collector/metrics/v1/metrics_service.proto (package opentelemetry.proto.collector.metrics.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import { ExportMetricsServiceRequest, ExportMetricsServiceResponse } from "./metrics_service_pb.js";
import { MethodKind } from "@bufbuild/protobuf";

/**
 * Service that can be used to push metrics between one Application
 * instrumented with OpenTelemetry and a collector, or between a collector and a
 * central collector.
 *
 * @generated from service opentelemetry.proto.collector.metrics.v1.MetricsService
 */
export const MetricsService = {
  typeName: "opentelemetry.proto.collector.metrics.v1.MetricsService",
  methods: {
    /**
     * For performance reasons, it is recommended to keep this RPC
     * alive for the entire life of the application.
     *
     * @generated from rpc opentelemetry.proto.collector.metrics.v1.MetricsService.Export
     */
    export: {
      name: "Export",
      I: ExportMetricsServiceRequest,
      O: ExportMetricsServiceResponse,
      kind: MethodKind.Unary,
    },
  }
} as const;

