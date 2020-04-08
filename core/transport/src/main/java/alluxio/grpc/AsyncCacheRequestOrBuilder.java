// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_worker.proto

package alluxio.grpc;

public interface AsyncCacheRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.AsyncCacheRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 block_id = 1;</code>
   * @return Whether the blockId field is set.
   */
  boolean hasBlockId();
  /**
   * <code>optional int64 block_id = 1;</code>
   * @return The blockId.
   */
  long getBlockId();

  /**
   * <pre>
   * TODO(calvin): source host and port should be replace with WorkerNetAddress
   * </pre>
   *
   * <code>optional string source_host = 2;</code>
   * @return Whether the sourceHost field is set.
   */
  boolean hasSourceHost();
  /**
   * <pre>
   * TODO(calvin): source host and port should be replace with WorkerNetAddress
   * </pre>
   *
   * <code>optional string source_host = 2;</code>
   * @return The sourceHost.
   */
  java.lang.String getSourceHost();
  /**
   * <pre>
   * TODO(calvin): source host and port should be replace with WorkerNetAddress
   * </pre>
   *
   * <code>optional string source_host = 2;</code>
   * @return The bytes for sourceHost.
   */
  com.google.protobuf.ByteString
      getSourceHostBytes();

  /**
   * <code>optional int32 source_port = 3;</code>
   * @return Whether the sourcePort field is set.
   */
  boolean hasSourcePort();
  /**
   * <code>optional int32 source_port = 3;</code>
   * @return The sourcePort.
   */
  int getSourcePort();

  /**
   * <code>optional .alluxio.proto.dataserver.OpenUfsBlockOptions open_ufs_block_options = 4;</code>
   * @return Whether the openUfsBlockOptions field is set.
   */
  boolean hasOpenUfsBlockOptions();
  /**
   * <code>optional .alluxio.proto.dataserver.OpenUfsBlockOptions open_ufs_block_options = 4;</code>
   * @return The openUfsBlockOptions.
   */
  alluxio.proto.dataserver.Protocol.OpenUfsBlockOptions getOpenUfsBlockOptions();
  /**
   * <code>optional .alluxio.proto.dataserver.OpenUfsBlockOptions open_ufs_block_options = 4;</code>
   */
  alluxio.proto.dataserver.Protocol.OpenUfsBlockOptionsOrBuilder getOpenUfsBlockOptionsOrBuilder();

  /**
   * <code>optional int64 length = 5;</code>
   * @return Whether the length field is set.
   */
  boolean hasLength();
  /**
   * <code>optional int64 length = 5;</code>
   * @return The length.
   */
  long getLength();
}