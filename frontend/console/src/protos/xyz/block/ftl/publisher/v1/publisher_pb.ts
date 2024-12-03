// @generated by protoc-gen-es v1.10.0 with parameter "target=ts"
// @generated from file xyz/block/ftl/publisher/v1/publisher.proto (package xyz.block.ftl.publisher.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";
import { Ref } from "../../v1/schema/schema_pb.js";

/**
 * @generated from message xyz.block.ftl.publisher.v1.PublishEventRequest
 */
export class PublishEventRequest extends Message<PublishEventRequest> {
  /**
   * @generated from field: xyz.block.ftl.v1.schema.Ref topic = 1;
   */
  topic?: Ref;

  /**
   * @generated from field: bytes body = 2;
   */
  body = new Uint8Array(0);

  /**
   * @generated from field: string key = 3;
   */
  key = "";

  /**
   * Only verb name is included because this verb will be in the same module as topic
   *
   * @generated from field: string caller = 4;
   */
  caller = "";

  constructor(data?: PartialMessage<PublishEventRequest>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "xyz.block.ftl.publisher.v1.PublishEventRequest";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "topic", kind: "message", T: Ref },
    { no: 2, name: "body", kind: "scalar", T: 12 /* ScalarType.BYTES */ },
    { no: 3, name: "key", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "caller", kind: "scalar", T: 9 /* ScalarType.STRING */ },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): PublishEventRequest {
    return new PublishEventRequest().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): PublishEventRequest {
    return new PublishEventRequest().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): PublishEventRequest {
    return new PublishEventRequest().fromJsonString(jsonString, options);
  }

  static equals(a: PublishEventRequest | PlainMessage<PublishEventRequest> | undefined, b: PublishEventRequest | PlainMessage<PublishEventRequest> | undefined): boolean {
    return proto3.util.equals(PublishEventRequest, a, b);
  }
}

/**
 * @generated from message xyz.block.ftl.publisher.v1.PublishEventResponse
 */
export class PublishEventResponse extends Message<PublishEventResponse> {
  constructor(data?: PartialMessage<PublishEventResponse>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "xyz.block.ftl.publisher.v1.PublishEventResponse";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): PublishEventResponse {
    return new PublishEventResponse().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): PublishEventResponse {
    return new PublishEventResponse().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): PublishEventResponse {
    return new PublishEventResponse().fromJsonString(jsonString, options);
  }

  static equals(a: PublishEventResponse | PlainMessage<PublishEventResponse> | undefined, b: PublishEventResponse | PlainMessage<PublishEventResponse> | undefined): boolean {
    return proto3.util.equals(PublishEventResponse, a, b);
  }
}

