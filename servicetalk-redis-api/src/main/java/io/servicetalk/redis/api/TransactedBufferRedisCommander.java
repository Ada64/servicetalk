/*
 * Copyright © 2018 Apple Inc. and the ServiceTalk project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicetalk.redis.api;

import io.servicetalk.buffer.api.Buffer;
import io.servicetalk.concurrent.api.AsyncCloseable;
import io.servicetalk.concurrent.api.Completable;
import io.servicetalk.concurrent.api.Single;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;
import javax.annotation.Generated;
import javax.annotation.Nullable;

/**
 * Redis transacted command client that uses {@link Buffer} for keys and data. Command methods return a {@link Single}
 * that completes with the result of the command after {@link #exec}, or with an error after {@link #discard}.
 * Transacted commanders are not expected to be thread-safe. That is, methods are not expected to be invoked
 * concurrently, and implementations may assume that.
 * <p>
 * Note that Redis Simple String responses are always returned as {@link String}.
 */
@Generated({})
public abstract class TransactedBufferRedisCommander implements AsyncCloseable {

    /**
     * {@inheritDoc}
     * <p>
     * This will close the underlying {@link RedisRequester}!
     */
    @Override
    public abstract Completable closeAsync();

    /**
     * {@inheritDoc}
     * <p>
     * This will close the underlying {@link RedisRequester}!
     */
    @Override
    public abstract Completable closeAsyncGracefully();

    /**
     * Append a value to a key.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.APPEND)
    public abstract Future<Long> append(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Authenticate to the server.
     *
     * @param password the password
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.AUTH)
    public abstract Future<String> auth(Buffer password);

    /**
     * Asynchronously rewrite the append-only file.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BGREWRITEAOF)
    public abstract Future<String> bgrewriteaof();

    /**
     * Asynchronously save the dataset to disk.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BGSAVE)
    public abstract Future<String> bgsave();

    /**
     * Count set bits in a string.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITCOUNT)
    public abstract Future<Long> bitcount(@RedisProtocolSupport.Key Buffer key);

    /**
     * Count set bits in a string.
     *
     * @param key the key
     * @param start the start
     * @param end the end
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITCOUNT)
    public abstract Future<Long> bitcount(@RedisProtocolSupport.Key Buffer key, @Nullable Long start,
                                          @Nullable Long end);

    /**
     * Perform arbitrary bitfield integer operations on strings.
     *
     * @param key the key
     * @param operations the operations
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITFIELD)
    public abstract Future<List<Long>> bitfield(@RedisProtocolSupport.Key Buffer key,
                                                @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BitfieldOperation> operations);

    /**
     * Perform bitwise operations between strings.
     *
     * @param operation the operation
     * @param destkey the destkey
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITOP)
    public abstract Future<Long> bitop(Buffer operation, @RedisProtocolSupport.Key Buffer destkey,
                                       @RedisProtocolSupport.Key Buffer key);

    /**
     * Perform bitwise operations between strings.
     *
     * @param operation the operation
     * @param destkey the destkey
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITOP)
    public abstract Future<Long> bitop(Buffer operation, @RedisProtocolSupport.Key Buffer destkey,
                                       @RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Perform bitwise operations between strings.
     *
     * @param operation the operation
     * @param destkey the destkey
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITOP)
    public abstract Future<Long> bitop(Buffer operation, @RedisProtocolSupport.Key Buffer destkey,
                                       @RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                       @RedisProtocolSupport.Key Buffer key3);

    /**
     * Perform bitwise operations between strings.
     *
     * @param operation the operation
     * @param destkey the destkey
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITOP)
    public abstract Future<Long> bitop(Buffer operation, @RedisProtocolSupport.Key Buffer destkey,
                                       @RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Find first bit set or clear in a string.
     *
     * @param key the key
     * @param bit the bit
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITPOS)
    public abstract Future<Long> bitpos(@RedisProtocolSupport.Key Buffer key, long bit);

    /**
     * Find first bit set or clear in a string.
     *
     * @param key the key
     * @param bit the bit
     * @param start the start
     * @param end the end
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BITPOS)
    public abstract Future<Long> bitpos(@RedisProtocolSupport.Key Buffer key, long bit, @Nullable Long start,
                                        @Nullable Long end);

    /**
     * Remove and get the first element in a list, or block until one is available.
     *
     * @param keys the keys
     * @param timeout the timeout
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BLPOP)
    public abstract <T> Future<List<T>> blpop(@RedisProtocolSupport.Key Collection<Buffer> keys, long timeout);

    /**
     * Remove and get the last element in a list, or block until one is available.
     *
     * @param keys the keys
     * @param timeout the timeout
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BRPOP)
    public abstract <T> Future<List<T>> brpop(@RedisProtocolSupport.Key Collection<Buffer> keys, long timeout);

    /**
     * Pop a value from a list, push it to another list and return it; or block until one is available.
     *
     * @param source the source
     * @param destination the destination
     * @param timeout the timeout
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BRPOPLPUSH)
    public abstract Future<Buffer> brpoplpush(@RedisProtocolSupport.Key Buffer source,
                                              @RedisProtocolSupport.Key Buffer destination, long timeout);

    /**
     * Remove and return the member with the highest score from one or more sorted sets, or block until one is
     * available.
     *
     * @param keys the keys
     * @param timeout the timeout
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BZPOPMAX)
    public abstract <T> Future<List<T>> bzpopmax(@RedisProtocolSupport.Key Collection<Buffer> keys, long timeout);

    /**
     * Remove and return the member with the lowest score from one or more sorted sets, or block until one is available.
     *
     * @param keys the keys
     * @param timeout the timeout
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.BZPOPMIN)
    public abstract <T> Future<List<T>> bzpopmin(@RedisProtocolSupport.Key Collection<Buffer> keys, long timeout);

    /**
     * Kill the connection of a client.
     *
     * @param id the id
     * @param type the type
     * @param addrIpPort the addrIpPort
     * @param skipmeYesNo the skipmeYesNo
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLIENT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.KILL)
    public abstract Future<Long> clientKill(@RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ID) @Nullable Long id,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ClientKillType type,
                                            @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ADDR) @Nullable Buffer addrIpPort,
                                            @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SKIPME) @Nullable Buffer skipmeYesNo);

    /**
     * Get the list of client connections.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLIENT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIST)
    public abstract Future<Buffer> clientList();

    /**
     * Get the current connection name.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLIENT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GETNAME)
    public abstract Future<Buffer> clientGetname();

    /**
     * Stop processing commands from clients for some time.
     *
     * @param timeout the timeout
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLIENT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.PAUSE)
    public abstract Future<String> clientPause(long timeout);

    /**
     * Instruct the server whether to reply to commands.
     *
     * @param replyMode the replyMode
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLIENT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.REPLY)
    public abstract Future<String> clientReply(@RedisProtocolSupport.Option RedisProtocolSupport.ClientReplyReplyMode replyMode);

    /**
     * Set the current connection name.
     *
     * @param connectionName the connectionName
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLIENT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SETNAME)
    public abstract Future<String> clientSetname(Buffer connectionName);

    /**
     * Assign new hash slots to receiving node.
     *
     * @param slot the slot
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ADDSLOTS)
    public abstract Future<String> clusterAddslots(long slot);

    /**
     * Assign new hash slots to receiving node.
     *
     * @param slot1 the slot1
     * @param slot2 the slot2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ADDSLOTS)
    public abstract Future<String> clusterAddslots(long slot1, long slot2);

    /**
     * Assign new hash slots to receiving node.
     *
     * @param slot1 the slot1
     * @param slot2 the slot2
     * @param slot3 the slot3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ADDSLOTS)
    public abstract Future<String> clusterAddslots(long slot1, long slot2, long slot3);

    /**
     * Assign new hash slots to receiving node.
     *
     * @param slots the slots
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ADDSLOTS)
    public abstract Future<String> clusterAddslots(Collection<Long> slots);

    /**
     * Return the number of failure reports active for a given node.
     *
     * @param nodeId the nodeId
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT_FAILURE_REPORTS)
    public abstract Future<Long> clusterCountFailureReports(Buffer nodeId);

    /**
     * Return the number of local keys in the specified hash slot.
     *
     * @param slot the slot
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNTKEYSINSLOT)
    public abstract Future<Long> clusterCountkeysinslot(long slot);

    /**
     * Set hash slots as unbound in receiving node.
     *
     * @param slot the slot
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.DELSLOTS)
    public abstract Future<String> clusterDelslots(long slot);

    /**
     * Set hash slots as unbound in receiving node.
     *
     * @param slot1 the slot1
     * @param slot2 the slot2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.DELSLOTS)
    public abstract Future<String> clusterDelslots(long slot1, long slot2);

    /**
     * Set hash slots as unbound in receiving node.
     *
     * @param slot1 the slot1
     * @param slot2 the slot2
     * @param slot3 the slot3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.DELSLOTS)
    public abstract Future<String> clusterDelslots(long slot1, long slot2, long slot3);

    /**
     * Set hash slots as unbound in receiving node.
     *
     * @param slots the slots
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.DELSLOTS)
    public abstract Future<String> clusterDelslots(Collection<Long> slots);

    /**
     * Forces a slave to perform a manual failover of its master.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.FAILOVER)
    public abstract Future<String> clusterFailover();

    /**
     * Forces a slave to perform a manual failover of its master.
     *
     * @param options the options
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.FAILOVER)
    public abstract Future<String> clusterFailover(@RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ClusterFailoverOptions options);

    /**
     * Remove a node from the nodes table.
     *
     * @param nodeId the nodeId
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.FORGET)
    public abstract Future<String> clusterForget(Buffer nodeId);

    /**
     * Return local key names in the specified hash slot.
     *
     * @param slot the slot
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GETKEYSINSLOT)
    public abstract <T> Future<List<T>> clusterGetkeysinslot(long slot, long count);

    /**
     * Provides info about Redis Cluster node state.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.INFO)
    public abstract Future<Buffer> clusterInfo();

    /**
     * Returns the hash slot of the specified key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.KEYSLOT)
    public abstract Future<Long> clusterKeyslot(Buffer key);

    /**
     * Force a node cluster to handshake with another node.
     *
     * @param ip the ip
     * @param port the port
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.MEET)
    public abstract Future<String> clusterMeet(Buffer ip, long port);

    /**
     * Get Cluster config for the node.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NODES)
    public abstract Future<Buffer> clusterNodes();

    /**
     * Reconfigure a node as a slave of the specified master node.
     *
     * @param nodeId the nodeId
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.REPLICATE)
    public abstract Future<String> clusterReplicate(Buffer nodeId);

    /**
     * Reset a Redis Cluster node.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.RESET)
    public abstract Future<String> clusterReset();

    /**
     * Reset a Redis Cluster node.
     *
     * @param resetType the resetType
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.RESET)
    public abstract Future<String> clusterReset(@RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ClusterResetResetType resetType);

    /**
     * Forces the node to save cluster state on disk.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SAVECONFIG)
    public abstract Future<String> clusterSaveconfig();

    /**
     * Set the configuration epoch in a new node.
     *
     * @param configEpoch the configEpoch
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SET_CONFIG_EPOCH)
    public abstract Future<String> clusterSetConfigEpoch(long configEpoch);

    /**
     * Bind a hash slot to a specific node.
     *
     * @param slot the slot
     * @param subcommand the subcommand
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SETSLOT)
    public abstract Future<String> clusterSetslot(long slot,
                                                  @RedisProtocolSupport.Option RedisProtocolSupport.ClusterSetslotSubcommand subcommand);

    /**
     * Bind a hash slot to a specific node.
     *
     * @param slot the slot
     * @param subcommand the subcommand
     * @param nodeId the nodeId
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SETSLOT)
    public abstract Future<String> clusterSetslot(long slot,
                                                  @RedisProtocolSupport.Option RedisProtocolSupport.ClusterSetslotSubcommand subcommand,
                                                  @Nullable Buffer nodeId);

    /**
     * List slave nodes of the specified master node.
     *
     * @param nodeId the nodeId
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SLAVES)
    public abstract Future<Buffer> clusterSlaves(Buffer nodeId);

    /**
     * Get array of Cluster slot to node mappings.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CLUSTER)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SLOTS)
    public abstract <T> Future<List<T>> clusterSlots();

    /**
     * Get array of Redis command details.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    public abstract <T> Future<List<T>> command();

    /**
     * Get total number of Redis commands.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT)
    public abstract Future<Long> commandCount();

    /**
     * Extract keys given a full Redis command.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GETKEYS)
    public abstract <T> Future<List<T>> commandGetkeys();

    /**
     * Get array of specific Redis command details.
     *
     * @param commandName the commandName
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.INFO)
    public abstract <T> Future<List<T>> commandInfo(Buffer commandName);

    /**
     * Get array of specific Redis command details.
     *
     * @param commandName1 the commandName1
     * @param commandName2 the commandName2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.INFO)
    public abstract <T> Future<List<T>> commandInfo(Buffer commandName1, Buffer commandName2);

    /**
     * Get array of specific Redis command details.
     *
     * @param commandName1 the commandName1
     * @param commandName2 the commandName2
     * @param commandName3 the commandName3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.INFO)
    public abstract <T> Future<List<T>> commandInfo(Buffer commandName1, Buffer commandName2, Buffer commandName3);

    /**
     * Get array of specific Redis command details.
     *
     * @param commandNames the commandNames
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.COMMAND)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.INFO)
    public abstract <T> Future<List<T>> commandInfo(Collection<Buffer> commandNames);

    /**
     * Get the value of a configuration parameter.
     *
     * @param parameter the parameter
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CONFIG)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GET)
    public abstract <T> Future<List<T>> configGet(Buffer parameter);

    /**
     * Rewrite the configuration file with the in memory configuration.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CONFIG)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.REWRITE)
    public abstract Future<String> configRewrite();

    /**
     * Set a configuration parameter to the given value.
     *
     * @param parameter the parameter
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CONFIG)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SET)
    public abstract Future<String> configSet(Buffer parameter, Buffer value);

    /**
     * Reset the stats returned by INFO.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.CONFIG)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.RESETSTAT)
    public abstract Future<String> configResetstat();

    /**
     * Return the number of keys in the selected database.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DBSIZE)
    public abstract Future<Long> dbsize();

    /**
     * Get debugging information about a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DEBUG)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.OBJECT)
    public abstract Future<String> debugObject(@RedisProtocolSupport.Key Buffer key);

    /**
     * Make the server crash.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DEBUG)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SEGFAULT)
    public abstract Future<String> debugSegfault();

    /**
     * Decrement the integer value of a key by one.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DECR)
    public abstract Future<Long> decr(@RedisProtocolSupport.Key Buffer key);

    /**
     * Decrement the integer value of a key by the given number.
     *
     * @param key the key
     * @param decrement the decrement
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DECRBY)
    public abstract Future<Long> decrby(@RedisProtocolSupport.Key Buffer key, long decrement);

    /**
     * Delete a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DEL)
    public abstract Future<Long> del(@RedisProtocolSupport.Key Buffer key);

    /**
     * Delete a key.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DEL)
    public abstract Future<Long> del(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Delete a key.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DEL)
    public abstract Future<Long> del(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                     @RedisProtocolSupport.Key Buffer key3);

    /**
     * Delete a key.
     *
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DEL)
    public abstract Future<Long> del(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Discard all commands issued after MULTI. This completes the {@link Single}s returned by the command methods with
     * a {@link TransactionAbortedException}.
     *
     * @return a {@link Single} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DISCARD)
    public abstract Single<String> discard();

    /**
     * Return a serialized version of the value stored at the specified key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.DUMP)
    public abstract Future<Buffer> dump(@RedisProtocolSupport.Key Buffer key);

    /**
     * Echo the given string.
     *
     * @param message the message
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ECHO)
    public abstract Future<Buffer> echo(Buffer message);

    /**
     * Execute a Lua script server side.
     *
     * @param script the script
     * @param numkeys the numkeys
     * @param keys the keys
     * @param args the args
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EVAL)
    public abstract Future<Buffer> eval(Buffer script, long numkeys, @RedisProtocolSupport.Key Collection<Buffer> keys,
                                        Collection<Buffer> args);

    /**
     * Execute a Lua script server side.
     *
     * @param script the script
     * @param numkeys the numkeys
     * @param keys the keys
     * @param args the args
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EVAL)
    public abstract <T> Future<List<T>> evalList(Buffer script, long numkeys,
                                                 @RedisProtocolSupport.Key Collection<Buffer> keys,
                                                 Collection<Buffer> args);

    /**
     * Execute a Lua script server side.
     *
     * @param script the script
     * @param numkeys the numkeys
     * @param keys the keys
     * @param args the args
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EVAL)
    public abstract Future<Long> evalLong(Buffer script, long numkeys,
                                          @RedisProtocolSupport.Key Collection<Buffer> keys, Collection<Buffer> args);

    /**
     * Execute a Lua script server side.
     *
     * @param sha1 the sha1
     * @param numkeys the numkeys
     * @param keys the keys
     * @param args the args
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EVALSHA)
    public abstract Future<Buffer> evalsha(Buffer sha1, long numkeys, @RedisProtocolSupport.Key Collection<Buffer> keys,
                                           Collection<Buffer> args);

    /**
     * Execute a Lua script server side.
     *
     * @param sha1 the sha1
     * @param numkeys the numkeys
     * @param keys the keys
     * @param args the args
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EVALSHA)
    public abstract <T> Future<List<T>> evalshaList(Buffer sha1, long numkeys,
                                                    @RedisProtocolSupport.Key Collection<Buffer> keys,
                                                    Collection<Buffer> args);

    /**
     * Execute a Lua script server side.
     *
     * @param sha1 the sha1
     * @param numkeys the numkeys
     * @param keys the keys
     * @param args the args
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EVALSHA)
    public abstract Future<Long> evalshaLong(Buffer sha1, long numkeys,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys,
                                             Collection<Buffer> args);

    /**
     * Execute all commands issued after MULTI. This completes the {@link Single}s returned by the command methods with
     * the corresponding value as returned by the EXEC.
     *
     * @return a {@link Completable} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXEC)
    public abstract Completable exec();

    /**
     * Determine if a key exists.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXISTS)
    public abstract Future<Long> exists(@RedisProtocolSupport.Key Buffer key);

    /**
     * Determine if a key exists.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXISTS)
    public abstract Future<Long> exists(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Determine if a key exists.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXISTS)
    public abstract Future<Long> exists(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                        @RedisProtocolSupport.Key Buffer key3);

    /**
     * Determine if a key exists.
     *
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXISTS)
    public abstract Future<Long> exists(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Set a key's time to live in seconds.
     *
     * @param key the key
     * @param seconds the seconds
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXPIRE)
    public abstract Future<Long> expire(@RedisProtocolSupport.Key Buffer key, long seconds);

    /**
     * Set the expiration for a key as a UNIX timestamp.
     *
     * @param key the key
     * @param timestamp the timestamp
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.EXPIREAT)
    public abstract Future<Long> expireat(@RedisProtocolSupport.Key Buffer key, long timestamp);

    /**
     * Remove all keys from all databases.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.FLUSHALL)
    public abstract Future<String> flushall();

    /**
     * Remove all keys from all databases.
     *
     * @param async the async
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.FLUSHALL)
    public abstract Future<String> flushall(@RedisProtocolSupport.Option @Nullable RedisProtocolSupport.FlushallAsync async);

    /**
     * Remove all keys from the current database.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.FLUSHDB)
    public abstract Future<String> flushdb();

    /**
     * Remove all keys from the current database.
     *
     * @param async the async
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.FLUSHDB)
    public abstract Future<String> flushdb(@RedisProtocolSupport.Option @Nullable RedisProtocolSupport.FlushdbAsync async);

    /**
     * Add one or more geospatial items in the geospatial index represented using a sorted set.
     *
     * @param key the key
     * @param longitude the longitude
     * @param latitude the latitude
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOADD)
    public abstract Future<Long> geoadd(@RedisProtocolSupport.Key Buffer key, double longitude, double latitude,
                                        Buffer member);

    /**
     * Add one or more geospatial items in the geospatial index represented using a sorted set.
     *
     * @param key the key
     * @param longitude1 the longitude1
     * @param latitude1 the latitude1
     * @param member1 the member1
     * @param longitude2 the longitude2
     * @param latitude2 the latitude2
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOADD)
    public abstract Future<Long> geoadd(@RedisProtocolSupport.Key Buffer key, double longitude1, double latitude1,
                                        Buffer member1, double longitude2, double latitude2, Buffer member2);

    /**
     * Add one or more geospatial items in the geospatial index represented using a sorted set.
     *
     * @param key the key
     * @param longitude1 the longitude1
     * @param latitude1 the latitude1
     * @param member1 the member1
     * @param longitude2 the longitude2
     * @param latitude2 the latitude2
     * @param member2 the member2
     * @param longitude3 the longitude3
     * @param latitude3 the latitude3
     * @param member3 the member3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOADD)
    public abstract Future<Long> geoadd(@RedisProtocolSupport.Key Buffer key, double longitude1, double latitude1,
                                        Buffer member1, double longitude2, double latitude2, Buffer member2,
                                        double longitude3, double latitude3, Buffer member3);

    /**
     * Add one or more geospatial items in the geospatial index represented using a sorted set.
     *
     * @param key the key
     * @param longitudeLatitudeMembers the longitudeLatitudeMembers
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOADD)
    public abstract Future<Long> geoadd(@RedisProtocolSupport.Key Buffer key,
                                        @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferLongitudeLatitudeMember> longitudeLatitudeMembers);

    /**
     * Returns the distance between two members of a geospatial index.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEODIST)
    public abstract Future<Double> geodist(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2);

    /**
     * Returns the distance between two members of a geospatial index.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @param unit the unit
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEODIST)
    public abstract Future<Double> geodist(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2,
                                           @Nullable Buffer unit);

    /**
     * Returns members of a geospatial index as standard geohash strings.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOHASH)
    public abstract <T> Future<List<T>> geohash(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Returns members of a geospatial index as standard geohash strings.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOHASH)
    public abstract <T> Future<List<T>> geohash(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2);

    /**
     * Returns members of a geospatial index as standard geohash strings.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @param member3 the member3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOHASH)
    public abstract <T> Future<List<T>> geohash(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2,
                                                Buffer member3);

    /**
     * Returns members of a geospatial index as standard geohash strings.
     *
     * @param key the key
     * @param members the members
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOHASH)
    public abstract <T> Future<List<T>> geohash(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> members);

    /**
     * Returns longitude and latitude of members of a geospatial index.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOPOS)
    public abstract <T> Future<List<T>> geopos(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Returns longitude and latitude of members of a geospatial index.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOPOS)
    public abstract <T> Future<List<T>> geopos(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2);

    /**
     * Returns longitude and latitude of members of a geospatial index.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @param member3 the member3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOPOS)
    public abstract <T> Future<List<T>> geopos(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2,
                                               Buffer member3);

    /**
     * Returns longitude and latitude of members of a geospatial index.
     *
     * @param key the key
     * @param members the members
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEOPOS)
    public abstract <T> Future<List<T>> geopos(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> members);

    /**
     * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a
     * point.
     *
     * @param key the key
     * @param longitude the longitude
     * @param latitude the latitude
     * @param radius the radius
     * @param unit the unit
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEORADIUS)
    public abstract <T> Future<List<T>> georadius(@RedisProtocolSupport.Key Buffer key, double longitude,
                                                  double latitude, double radius,
                                                  @RedisProtocolSupport.Option RedisProtocolSupport.GeoradiusUnit unit);

    /**
     * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a
     * point.
     *
     * @param key the key
     * @param longitude the longitude
     * @param latitude the latitude
     * @param radius the radius
     * @param unit the unit
     * @param withcoord the withcoord
     * @param withdist the withdist
     * @param withhash the withhash
     * @param count the count
     * @param order the order
     * @param storeKey the storeKey
     * @param storedistKey the storedistKey
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEORADIUS)
    public abstract <T> Future<List<T>> georadius(@RedisProtocolSupport.Key Buffer key, double longitude,
                                                  double latitude, double radius,
                                                  @RedisProtocolSupport.Option RedisProtocolSupport.GeoradiusUnit unit,
                                                  @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusWithcoord withcoord,
                                                  @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusWithdist withdist,
                                                  @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusWithhash withhash,
                                                  @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count,
                                                  @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusOrder order,
                                                  @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STORE) @Nullable @RedisProtocolSupport.Key Buffer storeKey,
                                                  @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STOREDIST) @Nullable @RedisProtocolSupport.Key Buffer storedistKey);

    /**
     * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a
     * member.
     *
     * @param key the key
     * @param member the member
     * @param radius the radius
     * @param unit the unit
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEORADIUSBYMEMBER)
    public abstract <T> Future<List<T>> georadiusbymember(@RedisProtocolSupport.Key Buffer key, Buffer member,
                                                          double radius,
                                                          @RedisProtocolSupport.Option RedisProtocolSupport.GeoradiusbymemberUnit unit);

    /**
     * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a
     * member.
     *
     * @param key the key
     * @param member the member
     * @param radius the radius
     * @param unit the unit
     * @param withcoord the withcoord
     * @param withdist the withdist
     * @param withhash the withhash
     * @param count the count
     * @param order the order
     * @param storeKey the storeKey
     * @param storedistKey the storedistKey
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GEORADIUSBYMEMBER)
    public abstract <T> Future<List<T>> georadiusbymember(@RedisProtocolSupport.Key Buffer key, Buffer member,
                                                          double radius,
                                                          @RedisProtocolSupport.Option RedisProtocolSupport.GeoradiusbymemberUnit unit,
                                                          @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusbymemberWithcoord withcoord,
                                                          @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusbymemberWithdist withdist,
                                                          @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusbymemberWithhash withhash,
                                                          @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count,
                                                          @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.GeoradiusbymemberOrder order,
                                                          @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STORE) @Nullable @RedisProtocolSupport.Key Buffer storeKey,
                                                          @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STOREDIST) @Nullable @RedisProtocolSupport.Key Buffer storedistKey);

    /**
     * Get the value of a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GET)
    public abstract Future<Buffer> get(@RedisProtocolSupport.Key Buffer key);

    /**
     * Returns the bit value at offset in the string value stored at key.
     *
     * @param key the key
     * @param offset the offset
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GETBIT)
    public abstract Future<Long> getbit(@RedisProtocolSupport.Key Buffer key, long offset);

    /**
     * Get a substring of the string stored at a key.
     *
     * @param key the key
     * @param start the start
     * @param end the end
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GETRANGE)
    public abstract Future<Buffer> getrange(@RedisProtocolSupport.Key Buffer key, long start, long end);

    /**
     * Set the string value of a key and return its old value.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.GETSET)
    public abstract Future<Buffer> getset(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Delete one or more hash fields.
     *
     * @param key the key
     * @param field the field
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HDEL)
    public abstract Future<Long> hdel(@RedisProtocolSupport.Key Buffer key, Buffer field);

    /**
     * Delete one or more hash fields.
     *
     * @param key the key
     * @param field1 the field1
     * @param field2 the field2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HDEL)
    public abstract Future<Long> hdel(@RedisProtocolSupport.Key Buffer key, Buffer field1, Buffer field2);

    /**
     * Delete one or more hash fields.
     *
     * @param key the key
     * @param field1 the field1
     * @param field2 the field2
     * @param field3 the field3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HDEL)
    public abstract Future<Long> hdel(@RedisProtocolSupport.Key Buffer key, Buffer field1, Buffer field2,
                                      Buffer field3);

    /**
     * Delete one or more hash fields.
     *
     * @param key the key
     * @param fields the fields
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HDEL)
    public abstract Future<Long> hdel(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> fields);

    /**
     * Determine if a hash field exists.
     *
     * @param key the key
     * @param field the field
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HEXISTS)
    public abstract Future<Long> hexists(@RedisProtocolSupport.Key Buffer key, Buffer field);

    /**
     * Get the value of a hash field.
     *
     * @param key the key
     * @param field the field
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HGET)
    public abstract Future<Buffer> hget(@RedisProtocolSupport.Key Buffer key, Buffer field);

    /**
     * Get all the fields and values in a hash.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HGETALL)
    public abstract <T> Future<List<T>> hgetall(@RedisProtocolSupport.Key Buffer key);

    /**
     * Increment the integer value of a hash field by the given number.
     *
     * @param key the key
     * @param field the field
     * @param increment the increment
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HINCRBY)
    public abstract Future<Long> hincrby(@RedisProtocolSupport.Key Buffer key, Buffer field, long increment);

    /**
     * Increment the float value of a hash field by the given amount.
     *
     * @param key the key
     * @param field the field
     * @param increment the increment
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HINCRBYFLOAT)
    public abstract Future<Double> hincrbyfloat(@RedisProtocolSupport.Key Buffer key, Buffer field, double increment);

    /**
     * Get all the fields in a hash.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HKEYS)
    public abstract <T> Future<List<T>> hkeys(@RedisProtocolSupport.Key Buffer key);

    /**
     * Get the number of fields in a hash.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HLEN)
    public abstract Future<Long> hlen(@RedisProtocolSupport.Key Buffer key);

    /**
     * Get the values of all the given hash fields.
     *
     * @param key the key
     * @param field the field
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMGET)
    public abstract <T> Future<List<T>> hmget(@RedisProtocolSupport.Key Buffer key, Buffer field);

    /**
     * Get the values of all the given hash fields.
     *
     * @param key the key
     * @param field1 the field1
     * @param field2 the field2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMGET)
    public abstract <T> Future<List<T>> hmget(@RedisProtocolSupport.Key Buffer key, Buffer field1, Buffer field2);

    /**
     * Get the values of all the given hash fields.
     *
     * @param key the key
     * @param field1 the field1
     * @param field2 the field2
     * @param field3 the field3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMGET)
    public abstract <T> Future<List<T>> hmget(@RedisProtocolSupport.Key Buffer key, Buffer field1, Buffer field2,
                                              Buffer field3);

    /**
     * Get the values of all the given hash fields.
     *
     * @param key the key
     * @param fields the fields
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMGET)
    public abstract <T> Future<List<T>> hmget(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> fields);

    /**
     * Set multiple hash fields to multiple values.
     *
     * @param key the key
     * @param field the field
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMSET)
    public abstract Future<String> hmset(@RedisProtocolSupport.Key Buffer key, Buffer field, Buffer value);

    /**
     * Set multiple hash fields to multiple values.
     *
     * @param key the key
     * @param field1 the field1
     * @param value1 the value1
     * @param field2 the field2
     * @param value2 the value2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMSET)
    public abstract Future<String> hmset(@RedisProtocolSupport.Key Buffer key, Buffer field1, Buffer value1,
                                         Buffer field2, Buffer value2);

    /**
     * Set multiple hash fields to multiple values.
     *
     * @param key the key
     * @param field1 the field1
     * @param value1 the value1
     * @param field2 the field2
     * @param value2 the value2
     * @param field3 the field3
     * @param value3 the value3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMSET)
    public abstract Future<String> hmset(@RedisProtocolSupport.Key Buffer key, Buffer field1, Buffer value1,
                                         Buffer field2, Buffer value2, Buffer field3, Buffer value3);

    /**
     * Set multiple hash fields to multiple values.
     *
     * @param key the key
     * @param fieldValues the fieldValues
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HMSET)
    public abstract Future<String> hmset(@RedisProtocolSupport.Key Buffer key,
                                         @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferFieldValue> fieldValues);

    /**
     * Incrementally iterate hash fields and associated values.
     *
     * @param key the key
     * @param cursor the cursor
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HSCAN)
    public abstract <T> Future<List<T>> hscan(@RedisProtocolSupport.Key Buffer key, long cursor);

    /**
     * Incrementally iterate hash fields and associated values.
     *
     * @param key the key
     * @param cursor the cursor
     * @param matchPattern the matchPattern
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HSCAN)
    public abstract <T> Future<List<T>> hscan(@RedisProtocolSupport.Key Buffer key, long cursor,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.MATCH) @Nullable Buffer matchPattern,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count);

    /**
     * Set the string value of a hash field.
     *
     * @param key the key
     * @param field the field
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HSET)
    public abstract Future<Long> hset(@RedisProtocolSupport.Key Buffer key, Buffer field, Buffer value);

    /**
     * Set the value of a hash field, only if the field does not exist.
     *
     * @param key the key
     * @param field the field
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HSETNX)
    public abstract Future<Long> hsetnx(@RedisProtocolSupport.Key Buffer key, Buffer field, Buffer value);

    /**
     * Get the length of the value of a hash field.
     *
     * @param key the key
     * @param field the field
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HSTRLEN)
    public abstract Future<Long> hstrlen(@RedisProtocolSupport.Key Buffer key, Buffer field);

    /**
     * Get all the values in a hash.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.HVALS)
    public abstract <T> Future<List<T>> hvals(@RedisProtocolSupport.Key Buffer key);

    /**
     * Increment the integer value of a key by one.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.INCR)
    public abstract Future<Long> incr(@RedisProtocolSupport.Key Buffer key);

    /**
     * Increment the integer value of a key by the given amount.
     *
     * @param key the key
     * @param increment the increment
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.INCRBY)
    public abstract Future<Long> incrby(@RedisProtocolSupport.Key Buffer key, long increment);

    /**
     * Increment the float value of a key by the given amount.
     *
     * @param key the key
     * @param increment the increment
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.INCRBYFLOAT)
    public abstract Future<Double> incrbyfloat(@RedisProtocolSupport.Key Buffer key, double increment);

    /**
     * Get information and statistics about the server.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.INFO)
    public abstract Future<Buffer> info();

    /**
     * Get information and statistics about the server.
     *
     * @param section the section
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.INFO)
    public abstract Future<Buffer> info(@Nullable Buffer section);

    /**
     * Find all keys matching the given pattern.
     *
     * @param pattern the pattern
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.KEYS)
    public abstract <T> Future<List<T>> keys(Buffer pattern);

    /**
     * Get the UNIX time stamp of the last successful save to disk.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LASTSAVE)
    public abstract Future<Long> lastsave();

    /**
     * Get an element from a list by its index.
     *
     * @param key the key
     * @param index the index
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LINDEX)
    public abstract Future<Buffer> lindex(@RedisProtocolSupport.Key Buffer key, long index);

    /**
     * Insert an element before or after another element in a list.
     *
     * @param key the key
     * @param where the where
     * @param pivot the pivot
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LINSERT)
    public abstract Future<Long> linsert(@RedisProtocolSupport.Key Buffer key,
                                         @RedisProtocolSupport.Option RedisProtocolSupport.LinsertWhere where,
                                         Buffer pivot, Buffer value);

    /**
     * Get the length of a list.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LLEN)
    public abstract Future<Long> llen(@RedisProtocolSupport.Key Buffer key);

    /**
     * Remove and get the first element in a list.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LPOP)
    public abstract Future<Buffer> lpop(@RedisProtocolSupport.Key Buffer key);

    /**
     * Prepend one or multiple values to a list.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LPUSH)
    public abstract Future<Long> lpush(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Prepend one or multiple values to a list.
     *
     * @param key the key
     * @param value1 the value1
     * @param value2 the value2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LPUSH)
    public abstract Future<Long> lpush(@RedisProtocolSupport.Key Buffer key, Buffer value1, Buffer value2);

    /**
     * Prepend one or multiple values to a list.
     *
     * @param key the key
     * @param value1 the value1
     * @param value2 the value2
     * @param value3 the value3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LPUSH)
    public abstract Future<Long> lpush(@RedisProtocolSupport.Key Buffer key, Buffer value1, Buffer value2,
                                       Buffer value3);

    /**
     * Prepend one or multiple values to a list.
     *
     * @param key the key
     * @param values the values
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LPUSH)
    public abstract Future<Long> lpush(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> values);

    /**
     * Prepend a value to a list, only if the list exists.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LPUSHX)
    public abstract Future<Long> lpushx(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Get a range of elements from a list.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LRANGE)
    public abstract <T> Future<List<T>> lrange(@RedisProtocolSupport.Key Buffer key, long start, long stop);

    /**
     * Remove elements from a list.
     *
     * @param key the key
     * @param count the count
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LREM)
    public abstract Future<Long> lrem(@RedisProtocolSupport.Key Buffer key, long count, Buffer value);

    /**
     * Set the value of an element in a list by its index.
     *
     * @param key the key
     * @param index the index
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LSET)
    public abstract Future<String> lset(@RedisProtocolSupport.Key Buffer key, long index, Buffer value);

    /**
     * Trim a list to the specified range.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.LTRIM)
    public abstract Future<String> ltrim(@RedisProtocolSupport.Key Buffer key, long start, long stop);

    /**
     * Outputs memory problems report.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.DOCTOR)
    public abstract Future<Buffer> memoryDoctor();

    /**
     * Show helpful text about the different subcommands.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.HELP)
    public abstract <T> Future<List<T>> memoryHelp();

    /**
     * Show allocator internal stats.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.MALLOC_STATS)
    public abstract Future<Buffer> memoryMallocStats();

    /**
     * Ask the allocator to release memory.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.PURGE)
    public abstract Future<String> memoryPurge();

    /**
     * Show memory usage details.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STATS)
    public abstract <T> Future<List<T>> memoryStats();

    /**
     * Estimate the memory usage of a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.USAGE)
    public abstract Future<Long> memoryUsage(@RedisProtocolSupport.Key Buffer key);

    /**
     * Estimate the memory usage of a key.
     *
     * @param key the key
     * @param samplesCount the samplesCount
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MEMORY)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.USAGE)
    public abstract Future<Long> memoryUsage(@RedisProtocolSupport.Key Buffer key,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.SAMPLES) @Nullable Long samplesCount);

    /**
     * Get the values of all the given keys.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MGET)
    public abstract <T> Future<List<T>> mget(@RedisProtocolSupport.Key Buffer key);

    /**
     * Get the values of all the given keys.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MGET)
    public abstract <T> Future<List<T>> mget(@RedisProtocolSupport.Key Buffer key1,
                                             @RedisProtocolSupport.Key Buffer key2);

    /**
     * Get the values of all the given keys.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MGET)
    public abstract <T> Future<List<T>> mget(@RedisProtocolSupport.Key Buffer key1,
                                             @RedisProtocolSupport.Key Buffer key2,
                                             @RedisProtocolSupport.Key Buffer key3);

    /**
     * Get the values of all the given keys.
     *
     * @param keys the keys
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MGET)
    public abstract <T> Future<List<T>> mget(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Move a key to another database.
     *
     * @param key the key
     * @param db the db
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MOVE)
    public abstract Future<Long> move(@RedisProtocolSupport.Key Buffer key, long db);

    /**
     * Set multiple keys to multiple values.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSET)
    public abstract Future<String> mset(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Set multiple keys to multiple values.
     *
     * @param key1 the key1
     * @param value1 the value1
     * @param key2 the key2
     * @param value2 the value2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSET)
    public abstract Future<String> mset(@RedisProtocolSupport.Key Buffer key1, Buffer value1,
                                        @RedisProtocolSupport.Key Buffer key2, Buffer value2);

    /**
     * Set multiple keys to multiple values.
     *
     * @param key1 the key1
     * @param value1 the value1
     * @param key2 the key2
     * @param value2 the value2
     * @param key3 the key3
     * @param value3 the value3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSET)
    public abstract Future<String> mset(@RedisProtocolSupport.Key Buffer key1, Buffer value1,
                                        @RedisProtocolSupport.Key Buffer key2, Buffer value2,
                                        @RedisProtocolSupport.Key Buffer key3, Buffer value3);

    /**
     * Set multiple keys to multiple values.
     *
     * @param keyValues the keyValues
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSET)
    public abstract Future<String> mset(@RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferKeyValue> keyValues);

    /**
     * Set multiple keys to multiple values, only if none of the keys exist.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSETNX)
    public abstract Future<Long> msetnx(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Set multiple keys to multiple values, only if none of the keys exist.
     *
     * @param key1 the key1
     * @param value1 the value1
     * @param key2 the key2
     * @param value2 the value2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSETNX)
    public abstract Future<Long> msetnx(@RedisProtocolSupport.Key Buffer key1, Buffer value1,
                                        @RedisProtocolSupport.Key Buffer key2, Buffer value2);

    /**
     * Set multiple keys to multiple values, only if none of the keys exist.
     *
     * @param key1 the key1
     * @param value1 the value1
     * @param key2 the key2
     * @param value2 the value2
     * @param key3 the key3
     * @param value3 the value3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSETNX)
    public abstract Future<Long> msetnx(@RedisProtocolSupport.Key Buffer key1, Buffer value1,
                                        @RedisProtocolSupport.Key Buffer key2, Buffer value2,
                                        @RedisProtocolSupport.Key Buffer key3, Buffer value3);

    /**
     * Set multiple keys to multiple values, only if none of the keys exist.
     *
     * @param keyValues the keyValues
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.MSETNX)
    public abstract Future<Long> msetnx(@RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferKeyValue> keyValues);

    /**
     * Returns the kind of internal representation used in order to store the value associated with a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.OBJECT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.ENCODING)
    public abstract Future<Buffer> objectEncoding(@RedisProtocolSupport.Key Buffer key);

    /**
     * Returns the logarithmic access frequency counter of the object stored at the specified key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.OBJECT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.FREQ)
    public abstract Future<Long> objectFreq(@RedisProtocolSupport.Key Buffer key);

    /**
     * Returns a succinct help text.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.OBJECT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.HELP)
    public abstract Future<List<String>> objectHelp();

    /**
     * Returns the number of seconds since the object stored at the specified key is idle.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.OBJECT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.IDLETIME)
    public abstract Future<Long> objectIdletime(@RedisProtocolSupport.Key Buffer key);

    /**
     * Returns the number of references of the value associated with the specified key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.OBJECT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.REFCOUNT)
    public abstract Future<Long> objectRefcount(@RedisProtocolSupport.Key Buffer key);

    /**
     * Remove the expiration from a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PERSIST)
    public abstract Future<Long> persist(@RedisProtocolSupport.Key Buffer key);

    /**
     * Set a key's time to live in milliseconds.
     *
     * @param key the key
     * @param milliseconds the milliseconds
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PEXPIRE)
    public abstract Future<Long> pexpire(@RedisProtocolSupport.Key Buffer key, long milliseconds);

    /**
     * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
     *
     * @param key the key
     * @param millisecondsTimestamp the millisecondsTimestamp
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PEXPIREAT)
    public abstract Future<Long> pexpireat(@RedisProtocolSupport.Key Buffer key, long millisecondsTimestamp);

    /**
     * Adds the specified elements to the specified HyperLogLog.
     *
     * @param key the key
     * @param element the element
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFADD)
    public abstract Future<Long> pfadd(@RedisProtocolSupport.Key Buffer key, Buffer element);

    /**
     * Adds the specified elements to the specified HyperLogLog.
     *
     * @param key the key
     * @param element1 the element1
     * @param element2 the element2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFADD)
    public abstract Future<Long> pfadd(@RedisProtocolSupport.Key Buffer key, Buffer element1, Buffer element2);

    /**
     * Adds the specified elements to the specified HyperLogLog.
     *
     * @param key the key
     * @param element1 the element1
     * @param element2 the element2
     * @param element3 the element3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFADD)
    public abstract Future<Long> pfadd(@RedisProtocolSupport.Key Buffer key, Buffer element1, Buffer element2,
                                       Buffer element3);

    /**
     * Adds the specified elements to the specified HyperLogLog.
     *
     * @param key the key
     * @param elements the elements
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFADD)
    public abstract Future<Long> pfadd(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> elements);

    /**
     * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFCOUNT)
    public abstract Future<Long> pfcount(@RedisProtocolSupport.Key Buffer key);

    /**
     * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFCOUNT)
    public abstract Future<Long> pfcount(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFCOUNT)
    public abstract Future<Long> pfcount(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                         @RedisProtocolSupport.Key Buffer key3);

    /**
     * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
     *
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFCOUNT)
    public abstract Future<Long> pfcount(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Merge N different HyperLogLogs into a single one.
     *
     * @param destkey the destkey
     * @param sourcekey the sourcekey
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFMERGE)
    public abstract Future<String> pfmerge(@RedisProtocolSupport.Key Buffer destkey,
                                           @RedisProtocolSupport.Key Buffer sourcekey);

    /**
     * Merge N different HyperLogLogs into a single one.
     *
     * @param destkey the destkey
     * @param sourcekey1 the sourcekey1
     * @param sourcekey2 the sourcekey2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFMERGE)
    public abstract Future<String> pfmerge(@RedisProtocolSupport.Key Buffer destkey,
                                           @RedisProtocolSupport.Key Buffer sourcekey1,
                                           @RedisProtocolSupport.Key Buffer sourcekey2);

    /**
     * Merge N different HyperLogLogs into a single one.
     *
     * @param destkey the destkey
     * @param sourcekey1 the sourcekey1
     * @param sourcekey2 the sourcekey2
     * @param sourcekey3 the sourcekey3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFMERGE)
    public abstract Future<String> pfmerge(@RedisProtocolSupport.Key Buffer destkey,
                                           @RedisProtocolSupport.Key Buffer sourcekey1,
                                           @RedisProtocolSupport.Key Buffer sourcekey2,
                                           @RedisProtocolSupport.Key Buffer sourcekey3);

    /**
     * Merge N different HyperLogLogs into a single one.
     *
     * @param destkey the destkey
     * @param sourcekeys the sourcekeys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PFMERGE)
    public abstract Future<String> pfmerge(@RedisProtocolSupport.Key Buffer destkey,
                                           @RedisProtocolSupport.Key Collection<Buffer> sourcekeys);

    /**
     * Ping the server.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PING)
    public abstract Future<String> ping();

    /**
     * Ping the server.
     *
     * @param message the message
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PING)
    public abstract Future<Buffer> ping(Buffer message);

    /**
     * Set the value and expiration in milliseconds of a key.
     *
     * @param key the key
     * @param milliseconds the milliseconds
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PSETEX)
    public abstract Future<String> psetex(@RedisProtocolSupport.Key Buffer key, long milliseconds, Buffer value);

    /**
     * Get the time to live for a key in milliseconds.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PTTL)
    public abstract Future<Long> pttl(@RedisProtocolSupport.Key Buffer key);

    /**
     * Post a message to a channel.
     *
     * @param channel the channel
     * @param message the message
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBLISH)
    public abstract Future<Long> publish(Buffer channel, Buffer message);

    /**
     * Lists the currently active channels.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.CHANNELS)
    public abstract Future<List<String>> pubsubChannels();

    /**
     * Lists the currently active channels.
     *
     * @param pattern the pattern
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.CHANNELS)
    public abstract Future<List<String>> pubsubChannels(@Nullable Buffer pattern);

    /**
     * Lists the currently active channels.
     *
     * @param pattern1 the pattern1
     * @param pattern2 the pattern2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.CHANNELS)
    public abstract Future<List<String>> pubsubChannels(@Nullable Buffer pattern1, @Nullable Buffer pattern2);

    /**
     * Lists the currently active channels.
     *
     * @param pattern1 the pattern1
     * @param pattern2 the pattern2
     * @param pattern3 the pattern3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.CHANNELS)
    public abstract Future<List<String>> pubsubChannels(@Nullable Buffer pattern1, @Nullable Buffer pattern2,
                                                        @Nullable Buffer pattern3);

    /**
     * Lists the currently active channels.
     *
     * @param patterns the patterns
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.CHANNELS)
    public abstract Future<List<String>> pubsubChannels(Collection<Buffer> patterns);

    /**
     * Returns the number of subscribers for the specified channels.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NUMSUB)
    public abstract <T> Future<List<T>> pubsubNumsub();

    /**
     * Returns the number of subscribers for the specified channels.
     *
     * @param channel the channel
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NUMSUB)
    public abstract <T> Future<List<T>> pubsubNumsub(@Nullable Buffer channel);

    /**
     * Returns the number of subscribers for the specified channels.
     *
     * @param channel1 the channel1
     * @param channel2 the channel2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NUMSUB)
    public abstract <T> Future<List<T>> pubsubNumsub(@Nullable Buffer channel1, @Nullable Buffer channel2);

    /**
     * Returns the number of subscribers for the specified channels.
     *
     * @param channel1 the channel1
     * @param channel2 the channel2
     * @param channel3 the channel3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NUMSUB)
    public abstract <T> Future<List<T>> pubsubNumsub(@Nullable Buffer channel1, @Nullable Buffer channel2,
                                                     @Nullable Buffer channel3);

    /**
     * Returns the number of subscribers for the specified channels.
     *
     * @param channels the channels
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NUMSUB)
    public abstract <T> Future<List<T>> pubsubNumsub(Collection<Buffer> channels);

    /**
     * Returns the number of subscriptions to patterns.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.PUBSUB)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.NUMPAT)
    public abstract Future<Long> pubsubNumpat();

    /**
     * Return a random key from the keyspace.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RANDOMKEY)
    public abstract Future<Buffer> randomkey();

    /**
     * Enables read queries for a connection to a cluster slave node.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.READONLY)
    public abstract Future<String> readonly();

    /**
     * Disables read queries for a connection to a cluster slave node.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.READWRITE)
    public abstract Future<String> readwrite();

    /**
     * Rename a key.
     *
     * @param key the key
     * @param newkey the newkey
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RENAME)
    public abstract Future<String> rename(@RedisProtocolSupport.Key Buffer key,
                                          @RedisProtocolSupport.Key Buffer newkey);

    /**
     * Rename a key, only if the new key does not exist.
     *
     * @param key the key
     * @param newkey the newkey
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RENAMENX)
    public abstract Future<Long> renamenx(@RedisProtocolSupport.Key Buffer key,
                                          @RedisProtocolSupport.Key Buffer newkey);

    /**
     * Create a key using the provided serialized value, previously obtained using DUMP.
     *
     * @param key the key
     * @param ttl the ttl
     * @param serializedValue the serializedValue
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RESTORE)
    public abstract Future<String> restore(@RedisProtocolSupport.Key Buffer key, long ttl, Buffer serializedValue);

    /**
     * Create a key using the provided serialized value, previously obtained using DUMP.
     *
     * @param key the key
     * @param ttl the ttl
     * @param serializedValue the serializedValue
     * @param replace the replace
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RESTORE)
    public abstract Future<String> restore(@RedisProtocolSupport.Key Buffer key, long ttl, Buffer serializedValue,
                                           @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.RestoreReplace replace);

    /**
     * Return the role of the instance in the context of replication.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ROLE)
    public abstract <T> Future<List<T>> role();

    /**
     * Remove and get the last element in a list.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPOP)
    public abstract Future<Buffer> rpop(@RedisProtocolSupport.Key Buffer key);

    /**
     * Remove the last element in a list, prepend it to another list and return it.
     *
     * @param source the source
     * @param destination the destination
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPOPLPUSH)
    public abstract Future<Buffer> rpoplpush(@RedisProtocolSupport.Key Buffer source,
                                             @RedisProtocolSupport.Key Buffer destination);

    /**
     * Append one or multiple values to a list.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPUSH)
    public abstract Future<Long> rpush(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Append one or multiple values to a list.
     *
     * @param key the key
     * @param value1 the value1
     * @param value2 the value2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPUSH)
    public abstract Future<Long> rpush(@RedisProtocolSupport.Key Buffer key, Buffer value1, Buffer value2);

    /**
     * Append one or multiple values to a list.
     *
     * @param key the key
     * @param value1 the value1
     * @param value2 the value2
     * @param value3 the value3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPUSH)
    public abstract Future<Long> rpush(@RedisProtocolSupport.Key Buffer key, Buffer value1, Buffer value2,
                                       Buffer value3);

    /**
     * Append one or multiple values to a list.
     *
     * @param key the key
     * @param values the values
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPUSH)
    public abstract Future<Long> rpush(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> values);

    /**
     * Append a value to a list, only if the list exists.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.RPUSHX)
    public abstract Future<Long> rpushx(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Add one or more members to a set.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SADD)
    public abstract Future<Long> sadd(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Add one or more members to a set.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SADD)
    public abstract Future<Long> sadd(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2);

    /**
     * Add one or more members to a set.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @param member3 the member3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SADD)
    public abstract Future<Long> sadd(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2,
                                      Buffer member3);

    /**
     * Add one or more members to a set.
     *
     * @param key the key
     * @param members the members
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SADD)
    public abstract Future<Long> sadd(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> members);

    /**
     * Synchronously save the dataset to disk.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SAVE)
    public abstract Future<String> save();

    /**
     * Incrementally iterate the keys space.
     *
     * @param cursor the cursor
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCAN)
    public abstract <T> Future<List<T>> scan(long cursor);

    /**
     * Incrementally iterate the keys space.
     *
     * @param cursor the cursor
     * @param matchPattern the matchPattern
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCAN)
    public abstract <T> Future<List<T>> scan(long cursor,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.MATCH) @Nullable Buffer matchPattern,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count);

    /**
     * Get the number of members in a set.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCARD)
    public abstract Future<Long> scard(@RedisProtocolSupport.Key Buffer key);

    /**
     * Set the debug mode for executed scripts.
     *
     * @param mode the mode
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.DEBUG)
    public abstract Future<String> scriptDebug(@RedisProtocolSupport.Option RedisProtocolSupport.ScriptDebugMode mode);

    /**
     * Check existence of scripts in the script cache.
     *
     * @param sha1 the sha1
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.EXISTS)
    public abstract <T> Future<List<T>> scriptExists(Buffer sha1);

    /**
     * Check existence of scripts in the script cache.
     *
     * @param sha11 the sha11
     * @param sha12 the sha12
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.EXISTS)
    public abstract <T> Future<List<T>> scriptExists(Buffer sha11, Buffer sha12);

    /**
     * Check existence of scripts in the script cache.
     *
     * @param sha11 the sha11
     * @param sha12 the sha12
     * @param sha13 the sha13
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.EXISTS)
    public abstract <T> Future<List<T>> scriptExists(Buffer sha11, Buffer sha12, Buffer sha13);

    /**
     * Check existence of scripts in the script cache.
     *
     * @param sha1s the sha1s
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.EXISTS)
    public abstract <T> Future<List<T>> scriptExists(Collection<Buffer> sha1s);

    /**
     * Remove all the scripts from the script cache.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.FLUSH)
    public abstract Future<String> scriptFlush();

    /**
     * Kill the script currently in execution.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.KILL)
    public abstract Future<String> scriptKill();

    /**
     * Load the specified Lua script into the script cache.
     *
     * @param script the script
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SCRIPT)
    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LOAD)
    public abstract Future<Buffer> scriptLoad(Buffer script);

    /**
     * Subtract multiple sets.
     *
     * @param firstkey the firstkey
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFF)
    public abstract <T> Future<List<T>> sdiff(@RedisProtocolSupport.Key Buffer firstkey);

    /**
     * Subtract multiple sets.
     *
     * @param firstkey the firstkey
     * @param otherkey the otherkey
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFF)
    public abstract <T> Future<List<T>> sdiff(@RedisProtocolSupport.Key Buffer firstkey,
                                              @Nullable @RedisProtocolSupport.Key Buffer otherkey);

    /**
     * Subtract multiple sets.
     *
     * @param firstkey the firstkey
     * @param otherkey1 the otherkey1
     * @param otherkey2 the otherkey2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFF)
    public abstract <T> Future<List<T>> sdiff(@RedisProtocolSupport.Key Buffer firstkey,
                                              @Nullable @RedisProtocolSupport.Key Buffer otherkey1,
                                              @Nullable @RedisProtocolSupport.Key Buffer otherkey2);

    /**
     * Subtract multiple sets.
     *
     * @param firstkey the firstkey
     * @param otherkey1 the otherkey1
     * @param otherkey2 the otherkey2
     * @param otherkey3 the otherkey3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFF)
    public abstract <T> Future<List<T>> sdiff(@RedisProtocolSupport.Key Buffer firstkey,
                                              @Nullable @RedisProtocolSupport.Key Buffer otherkey1,
                                              @Nullable @RedisProtocolSupport.Key Buffer otherkey2,
                                              @Nullable @RedisProtocolSupport.Key Buffer otherkey3);

    /**
     * Subtract multiple sets.
     *
     * @param firstkey the firstkey
     * @param otherkeys the otherkeys
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFF)
    public abstract <T> Future<List<T>> sdiff(@RedisProtocolSupport.Key Buffer firstkey,
                                              @RedisProtocolSupport.Key Collection<Buffer> otherkeys);

    /**
     * Subtract multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param firstkey the firstkey
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFFSTORE)
    public abstract Future<Long> sdiffstore(@RedisProtocolSupport.Key Buffer destination,
                                            @RedisProtocolSupport.Key Buffer firstkey);

    /**
     * Subtract multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param firstkey the firstkey
     * @param otherkey the otherkey
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFFSTORE)
    public abstract Future<Long> sdiffstore(@RedisProtocolSupport.Key Buffer destination,
                                            @RedisProtocolSupport.Key Buffer firstkey,
                                            @Nullable @RedisProtocolSupport.Key Buffer otherkey);

    /**
     * Subtract multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param firstkey the firstkey
     * @param otherkey1 the otherkey1
     * @param otherkey2 the otherkey2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFFSTORE)
    public abstract Future<Long> sdiffstore(@RedisProtocolSupport.Key Buffer destination,
                                            @RedisProtocolSupport.Key Buffer firstkey,
                                            @Nullable @RedisProtocolSupport.Key Buffer otherkey1,
                                            @Nullable @RedisProtocolSupport.Key Buffer otherkey2);

    /**
     * Subtract multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param firstkey the firstkey
     * @param otherkey1 the otherkey1
     * @param otherkey2 the otherkey2
     * @param otherkey3 the otherkey3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFFSTORE)
    public abstract Future<Long> sdiffstore(@RedisProtocolSupport.Key Buffer destination,
                                            @RedisProtocolSupport.Key Buffer firstkey,
                                            @Nullable @RedisProtocolSupport.Key Buffer otherkey1,
                                            @Nullable @RedisProtocolSupport.Key Buffer otherkey2,
                                            @Nullable @RedisProtocolSupport.Key Buffer otherkey3);

    /**
     * Subtract multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param firstkey the firstkey
     * @param otherkeys the otherkeys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SDIFFSTORE)
    public abstract Future<Long> sdiffstore(@RedisProtocolSupport.Key Buffer destination,
                                            @RedisProtocolSupport.Key Buffer firstkey,
                                            @RedisProtocolSupport.Key Collection<Buffer> otherkeys);

    /**
     * Change the selected database for the current connection.
     *
     * @param index the index
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SELECT)
    public abstract Future<String> select(long index);

    /**
     * Set the string value of a key.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SET)
    public abstract Future<String> set(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Set the string value of a key.
     *
     * @param key the key
     * @param value the value
     * @param expireDuration the expireDuration
     * @param condition the condition
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SET)
    public abstract Future<String> set(@RedisProtocolSupport.Key Buffer key, Buffer value,
                                       @RedisProtocolSupport.Tuple @Nullable RedisProtocolSupport.ExpireDuration expireDuration,
                                       @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.SetCondition condition);

    /**
     * Sets or clears the bit at offset in the string value stored at key.
     *
     * @param key the key
     * @param offset the offset
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SETBIT)
    public abstract Future<Long> setbit(@RedisProtocolSupport.Key Buffer key, long offset, Buffer value);

    /**
     * Set the value and expiration of a key.
     *
     * @param key the key
     * @param seconds the seconds
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SETEX)
    public abstract Future<String> setex(@RedisProtocolSupport.Key Buffer key, long seconds, Buffer value);

    /**
     * Set the value of a key, only if the key does not exist.
     *
     * @param key the key
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SETNX)
    public abstract Future<Long> setnx(@RedisProtocolSupport.Key Buffer key, Buffer value);

    /**
     * Overwrite part of a string at key starting at the specified offset.
     *
     * @param key the key
     * @param offset the offset
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SETRANGE)
    public abstract Future<Long> setrange(@RedisProtocolSupport.Key Buffer key, long offset, Buffer value);

    /**
     * Synchronously save the dataset to disk and then shut down the server.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SHUTDOWN)
    public abstract Future<String> shutdown();

    /**
     * Synchronously save the dataset to disk and then shut down the server.
     *
     * @param saveMode the saveMode
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SHUTDOWN)
    public abstract Future<String> shutdown(@RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ShutdownSaveMode saveMode);

    /**
     * Intersect multiple sets.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTER)
    public abstract <T> Future<List<T>> sinter(@RedisProtocolSupport.Key Buffer key);

    /**
     * Intersect multiple sets.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTER)
    public abstract <T> Future<List<T>> sinter(@RedisProtocolSupport.Key Buffer key1,
                                               @RedisProtocolSupport.Key Buffer key2);

    /**
     * Intersect multiple sets.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTER)
    public abstract <T> Future<List<T>> sinter(@RedisProtocolSupport.Key Buffer key1,
                                               @RedisProtocolSupport.Key Buffer key2,
                                               @RedisProtocolSupport.Key Buffer key3);

    /**
     * Intersect multiple sets.
     *
     * @param keys the keys
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTER)
    public abstract <T> Future<List<T>> sinter(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Intersect multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTERSTORE)
    public abstract Future<Long> sinterstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Buffer key);

    /**
     * Intersect multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTERSTORE)
    public abstract Future<Long> sinterstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Buffer key1,
                                             @RedisProtocolSupport.Key Buffer key2);

    /**
     * Intersect multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTERSTORE)
    public abstract Future<Long> sinterstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Buffer key1,
                                             @RedisProtocolSupport.Key Buffer key2,
                                             @RedisProtocolSupport.Key Buffer key3);

    /**
     * Intersect multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SINTERSTORE)
    public abstract Future<Long> sinterstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Determine if a given value is a member of a set.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SISMEMBER)
    public abstract Future<Long> sismember(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Make the server a slave of another instance, or promote it as master.
     *
     * @param host the host
     * @param port the port
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SLAVEOF)
    public abstract Future<String> slaveof(Buffer host, Buffer port);

    /**
     * Manages the Redis slow queries log.
     *
     * @param subcommand the subcommand
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SLOWLOG)
    public abstract <T> Future<List<T>> slowlog(Buffer subcommand);

    /**
     * Manages the Redis slow queries log.
     *
     * @param subcommand the subcommand
     * @param argument the argument
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SLOWLOG)
    public abstract <T> Future<List<T>> slowlog(Buffer subcommand, @Nullable Buffer argument);

    /**
     * Get all the members in a set.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SMEMBERS)
    public abstract <T> Future<List<T>> smembers(@RedisProtocolSupport.Key Buffer key);

    /**
     * Move a member from one set to another.
     *
     * @param source the source
     * @param destination the destination
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SMOVE)
    public abstract Future<Long> smove(@RedisProtocolSupport.Key Buffer source,
                                       @RedisProtocolSupport.Key Buffer destination, Buffer member);

    /**
     * Sort the elements in a list, set or sorted set.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SORT)
    public abstract <T> Future<List<T>> sort(@RedisProtocolSupport.Key Buffer key);

    /**
     * Sort the elements in a list, set or sorted set.
     *
     * @param key the key
     * @param byPattern the byPattern
     * @param offsetCount the offsetCount
     * @param getPatterns the getPatterns
     * @param order the order
     * @param sorting the sorting
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SORT)
    public abstract <T> Future<List<T>> sort(@RedisProtocolSupport.Key Buffer key,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.BY) @Nullable Buffer byPattern,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIMIT) @Nullable @RedisProtocolSupport.Tuple RedisProtocolSupport.OffsetCount offsetCount,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GET) Collection<Buffer> getPatterns,
                                             @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.SortOrder order,
                                             @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.SortSorting sorting);

    /**
     * Sort the elements in a list, set or sorted set.
     *
     * @param key the key
     * @param storeDestination the storeDestination
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SORT)
    public abstract Future<Long> sort(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STORE) @RedisProtocolSupport.Key Buffer storeDestination);

    /**
     * Sort the elements in a list, set or sorted set.
     *
     * @param key the key
     * @param storeDestination the storeDestination
     * @param byPattern the byPattern
     * @param offsetCount the offsetCount
     * @param getPatterns the getPatterns
     * @param order the order
     * @param sorting the sorting
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SORT)
    public abstract Future<Long> sort(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.STORE) @RedisProtocolSupport.Key Buffer storeDestination,
                                      @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.BY) @Nullable Buffer byPattern,
                                      @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIMIT) @Nullable @RedisProtocolSupport.Tuple RedisProtocolSupport.OffsetCount offsetCount,
                                      @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GET) Collection<Buffer> getPatterns,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.SortOrder order,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.SortSorting sorting);

    /**
     * Remove and return one or multiple random members from a set.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SPOP)
    public abstract Future<Buffer> spop(@RedisProtocolSupport.Key Buffer key);

    /**
     * Remove and return one or multiple random members from a set.
     *
     * @param key the key
     * @param count the count
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SPOP)
    public abstract Future<Buffer> spop(@RedisProtocolSupport.Key Buffer key, @Nullable Long count);

    /**
     * Get one or multiple random members from a set.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SRANDMEMBER)
    public abstract Future<Buffer> srandmember(@RedisProtocolSupport.Key Buffer key);

    /**
     * Get one or multiple random members from a set.
     *
     * @param key the key
     * @param count the count
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SRANDMEMBER)
    public abstract Future<List<String>> srandmember(@RedisProtocolSupport.Key Buffer key, long count);

    /**
     * Remove one or more members from a set.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SREM)
    public abstract Future<Long> srem(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Remove one or more members from a set.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SREM)
    public abstract Future<Long> srem(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2);

    /**
     * Remove one or more members from a set.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @param member3 the member3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SREM)
    public abstract Future<Long> srem(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2,
                                      Buffer member3);

    /**
     * Remove one or more members from a set.
     *
     * @param key the key
     * @param members the members
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SREM)
    public abstract Future<Long> srem(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> members);

    /**
     * Incrementally iterate Set elements.
     *
     * @param key the key
     * @param cursor the cursor
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SSCAN)
    public abstract <T> Future<List<T>> sscan(@RedisProtocolSupport.Key Buffer key, long cursor);

    /**
     * Incrementally iterate Set elements.
     *
     * @param key the key
     * @param cursor the cursor
     * @param matchPattern the matchPattern
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SSCAN)
    public abstract <T> Future<List<T>> sscan(@RedisProtocolSupport.Key Buffer key, long cursor,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.MATCH) @Nullable Buffer matchPattern,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count);

    /**
     * Get the length of the value stored in a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.STRLEN)
    public abstract Future<Long> strlen(@RedisProtocolSupport.Key Buffer key);

    /**
     * Add multiple sets.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNION)
    public abstract <T> Future<List<T>> sunion(@RedisProtocolSupport.Key Buffer key);

    /**
     * Add multiple sets.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNION)
    public abstract <T> Future<List<T>> sunion(@RedisProtocolSupport.Key Buffer key1,
                                               @RedisProtocolSupport.Key Buffer key2);

    /**
     * Add multiple sets.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNION)
    public abstract <T> Future<List<T>> sunion(@RedisProtocolSupport.Key Buffer key1,
                                               @RedisProtocolSupport.Key Buffer key2,
                                               @RedisProtocolSupport.Key Buffer key3);

    /**
     * Add multiple sets.
     *
     * @param keys the keys
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNION)
    public abstract <T> Future<List<T>> sunion(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Add multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNIONSTORE)
    public abstract Future<Long> sunionstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Buffer key);

    /**
     * Add multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNIONSTORE)
    public abstract Future<Long> sunionstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Buffer key1,
                                             @RedisProtocolSupport.Key Buffer key2);

    /**
     * Add multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNIONSTORE)
    public abstract Future<Long> sunionstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Buffer key1,
                                             @RedisProtocolSupport.Key Buffer key2,
                                             @RedisProtocolSupport.Key Buffer key3);

    /**
     * Add multiple sets and store the resulting set in a key.
     *
     * @param destination the destination
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SUNIONSTORE)
    public abstract Future<Long> sunionstore(@RedisProtocolSupport.Key Buffer destination,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Swaps two Redis databases.
     *
     * @param index the index
     * @param index1 the index1
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.SWAPDB)
    public abstract Future<String> swapdb(long index, long index1);

    /**
     * Return the current server time.
     *
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TIME)
    public abstract <T> Future<List<T>> time();

    /**
     * Alters the last access time of a key(s). Returns the number of existing keys specified.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TOUCH)
    public abstract Future<Long> touch(@RedisProtocolSupport.Key Buffer key);

    /**
     * Alters the last access time of a key(s). Returns the number of existing keys specified.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TOUCH)
    public abstract Future<Long> touch(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Alters the last access time of a key(s). Returns the number of existing keys specified.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TOUCH)
    public abstract Future<Long> touch(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                       @RedisProtocolSupport.Key Buffer key3);

    /**
     * Alters the last access time of a key(s). Returns the number of existing keys specified.
     *
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TOUCH)
    public abstract Future<Long> touch(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Get the time to live for a key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TTL)
    public abstract Future<Long> ttl(@RedisProtocolSupport.Key Buffer key);

    /**
     * Determine the type stored at key.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.TYPE)
    public abstract Future<String> type(@RedisProtocolSupport.Key Buffer key);

    /**
     * Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.UNLINK)
    public abstract Future<Long> unlink(@RedisProtocolSupport.Key Buffer key);

    /**
     * Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.UNLINK)
    public abstract Future<Long> unlink(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.UNLINK)
    public abstract Future<Long> unlink(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                        @RedisProtocolSupport.Key Buffer key3);

    /**
     * Delete a key asynchronously in another thread. Otherwise it is just as DEL, but non blocking.
     *
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.UNLINK)
    public abstract Future<Long> unlink(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Forget about all watched keys.
     *
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.UNWATCH)
    public abstract Future<String> unwatch();

    /**
     * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
     *
     * @param numslaves the numslaves
     * @param timeout the timeout
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.WAIT)
    public abstract Future<Long> wait(long numslaves, long timeout);

    /**
     * Watch the given keys to determine execution of the MULTI/EXEC block.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.WATCH)
    public abstract Future<String> watch(@RedisProtocolSupport.Key Buffer key);

    /**
     * Watch the given keys to determine execution of the MULTI/EXEC block.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.WATCH)
    public abstract Future<String> watch(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2);

    /**
     * Watch the given keys to determine execution of the MULTI/EXEC block.
     *
     * @param key1 the key1
     * @param key2 the key2
     * @param key3 the key3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.WATCH)
    public abstract Future<String> watch(@RedisProtocolSupport.Key Buffer key1, @RedisProtocolSupport.Key Buffer key2,
                                         @RedisProtocolSupport.Key Buffer key3);

    /**
     * Watch the given keys to determine execution of the MULTI/EXEC block.
     *
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.WATCH)
    public abstract Future<String> watch(@RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Appends a new entry to a stream.
     *
     * @param key the key
     * @param id the id
     * @param field the field
     * @param value the value
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XADD)
    public abstract Future<Buffer> xadd(@RedisProtocolSupport.Key Buffer key, Buffer id, Buffer field, Buffer value);

    /**
     * Appends a new entry to a stream.
     *
     * @param key the key
     * @param id the id
     * @param field1 the field1
     * @param value1 the value1
     * @param field2 the field2
     * @param value2 the value2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XADD)
    public abstract Future<Buffer> xadd(@RedisProtocolSupport.Key Buffer key, Buffer id, Buffer field1, Buffer value1,
                                        Buffer field2, Buffer value2);

    /**
     * Appends a new entry to a stream.
     *
     * @param key the key
     * @param id the id
     * @param field1 the field1
     * @param value1 the value1
     * @param field2 the field2
     * @param value2 the value2
     * @param field3 the field3
     * @param value3 the value3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XADD)
    public abstract Future<Buffer> xadd(@RedisProtocolSupport.Key Buffer key, Buffer id, Buffer field1, Buffer value1,
                                        Buffer field2, Buffer value2, Buffer field3, Buffer value3);

    /**
     * Appends a new entry to a stream.
     *
     * @param key the key
     * @param id the id
     * @param fieldValues the fieldValues
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XADD)
    public abstract Future<Buffer> xadd(@RedisProtocolSupport.Key Buffer key, Buffer id,
                                        @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferFieldValue> fieldValues);

    /**
     * Return the number of entires in a stream.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XLEN)
    public abstract Future<Long> xlen(@RedisProtocolSupport.Key Buffer key);

    /**
     * Return information and entries from a stream conusmer group pending entries list, that are messages fetched but
     * never acknowledged.
     *
     * @param key the key
     * @param group the group
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XPENDING)
    public abstract <T> Future<List<T>> xpending(@RedisProtocolSupport.Key Buffer key, Buffer group);

    /**
     * Return information and entries from a stream conusmer group pending entries list, that are messages fetched but
     * never acknowledged.
     *
     * @param key the key
     * @param group the group
     * @param start the start
     * @param end the end
     * @param count the count
     * @param consumer the consumer
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XPENDING)
    public abstract <T> Future<List<T>> xpending(@RedisProtocolSupport.Key Buffer key, Buffer group,
                                                 @Nullable Buffer start, @Nullable Buffer end, @Nullable Long count,
                                                 @Nullable Buffer consumer);

    /**
     * Return a range of elements in a stream, with IDs matching the specified IDs interval.
     *
     * @param key the key
     * @param start the start
     * @param end the end
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XRANGE)
    public abstract <T> Future<List<T>> xrange(@RedisProtocolSupport.Key Buffer key, Buffer start, Buffer end);

    /**
     * Return a range of elements in a stream, with IDs matching the specified IDs interval.
     *
     * @param key the key
     * @param start the start
     * @param end the end
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XRANGE)
    public abstract <T> Future<List<T>> xrange(@RedisProtocolSupport.Key Buffer key, Buffer start, Buffer end,
                                               @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count);

    /**
     * Return never seen elements in multiple streams, with IDs greater than the ones reported by the caller for each
     * stream. Can block.
     *
     * @param keys the keys
     * @param ids the ids
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XREAD)
    public abstract <T> Future<List<T>> xread(@RedisProtocolSupport.Key Collection<Buffer> keys,
                                              Collection<Buffer> ids);

    /**
     * Return never seen elements in multiple streams, with IDs greater than the ones reported by the caller for each
     * stream. Can block.
     *
     * @param count the count
     * @param blockMilliseconds the blockMilliseconds
     * @param keys the keys
     * @param ids the ids
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XREAD)
    public abstract <T> Future<List<T>> xread(@RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.BLOCK) @Nullable Long blockMilliseconds,
                                              @RedisProtocolSupport.Key Collection<Buffer> keys,
                                              Collection<Buffer> ids);

    /**
     * Return new entries from a stream using a consumer group, or access the history of the pending entries for a given
     * consumer. Can block.
     *
     * @param groupConsumer the groupConsumer
     * @param keys the keys
     * @param ids the ids
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XREADGROUP)
    public abstract <T> Future<List<T>> xreadgroup(@RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GROUP) @RedisProtocolSupport.Tuple RedisProtocolSupport.BufferGroupConsumer groupConsumer,
                                                   @RedisProtocolSupport.Key Collection<Buffer> keys,
                                                   Collection<Buffer> ids);

    /**
     * Return new entries from a stream using a consumer group, or access the history of the pending entries for a given
     * consumer. Can block.
     *
     * @param groupConsumer the groupConsumer
     * @param count the count
     * @param blockMilliseconds the blockMilliseconds
     * @param keys the keys
     * @param ids the ids
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XREADGROUP)
    public abstract <T> Future<List<T>> xreadgroup(@RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.GROUP) @RedisProtocolSupport.Tuple RedisProtocolSupport.BufferGroupConsumer groupConsumer,
                                                   @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count,
                                                   @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.BLOCK) @Nullable Long blockMilliseconds,
                                                   @RedisProtocolSupport.Key Collection<Buffer> keys,
                                                   Collection<Buffer> ids);

    /**
     * Return a range of elements in a stream, with IDs matching the specified IDs interval, in reverse order (from
     * greater to smaller IDs) compared to XRANGE.
     *
     * @param key the key
     * @param end the end
     * @param start the start
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XREVRANGE)
    public abstract <T> Future<List<T>> xrevrange(@RedisProtocolSupport.Key Buffer key, Buffer end, Buffer start);

    /**
     * Return a range of elements in a stream, with IDs matching the specified IDs interval, in reverse order (from
     * greater to smaller IDs) compared to XRANGE.
     *
     * @param key the key
     * @param end the end
     * @param start the start
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.XREVRANGE)
    public abstract <T> Future<List<T>> xrevrange(@RedisProtocolSupport.Key Buffer key, Buffer end, Buffer start,
                                                  @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param scoreMembers the scoreMembers
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Long> zadd(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferScoreMember> scoreMembers);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param score the score
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Long> zadd(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                      double score, Buffer member);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param score1 the score1
     * @param member1 the member1
     * @param score2 the score2
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Long> zadd(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                      double score1, Buffer member1, double score2, Buffer member2);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param score1 the score1
     * @param member1 the member1
     * @param score2 the score2
     * @param member2 the member2
     * @param score3 the score3
     * @param member3 the member3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Long> zadd(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                      double score1, Buffer member1, double score2, Buffer member2, double score3,
                                      Buffer member3);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param scoreMembers the scoreMembers
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Long> zadd(@RedisProtocolSupport.Key Buffer key,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                      @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferScoreMember> scoreMembers);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param scoreMembers the scoreMembers
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Double> zaddIncr(@RedisProtocolSupport.Key Buffer key,
                                            @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferScoreMember> scoreMembers);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param score the score
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Double> zaddIncr(@RedisProtocolSupport.Key Buffer key,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                            double score, Buffer member);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param score1 the score1
     * @param member1 the member1
     * @param score2 the score2
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Double> zaddIncr(@RedisProtocolSupport.Key Buffer key,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                            double score1, Buffer member1, double score2, Buffer member2);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param score1 the score1
     * @param member1 the member1
     * @param score2 the score2
     * @param member2 the member2
     * @param score3 the score3
     * @param member3 the member3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Double> zaddIncr(@RedisProtocolSupport.Key Buffer key,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                            double score1, Buffer member1, double score2, Buffer member2, double score3,
                                            Buffer member3);

    /**
     * Add one or more members to a sorted set, or update its score if it already exists.
     *
     * @param key the key
     * @param condition the condition
     * @param change the change
     * @param scoreMembers the scoreMembers
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZADD)
    public abstract Future<Double> zaddIncr(@RedisProtocolSupport.Key Buffer key,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddCondition condition,
                                            @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZaddChange change,
                                            @RedisProtocolSupport.Tuple Collection<RedisProtocolSupport.BufferScoreMember> scoreMembers);

    /**
     * Get the number of members in a sorted set.
     *
     * @param key the key
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZCARD)
    public abstract Future<Long> zcard(@RedisProtocolSupport.Key Buffer key);

    /**
     * Count the members in a sorted set with scores within the given values.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZCOUNT)
    public abstract Future<Long> zcount(@RedisProtocolSupport.Key Buffer key, double min, double max);

    /**
     * Increment the score of a member in a sorted set.
     *
     * @param key the key
     * @param increment the increment
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZINCRBY)
    public abstract Future<Double> zincrby(@RedisProtocolSupport.Key Buffer key, long increment, Buffer member);

    /**
     * Intersect multiple sorted sets and store the resulting sorted set in a new key.
     *
     * @param destination the destination
     * @param numkeys the numkeys
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZINTERSTORE)
    public abstract Future<Long> zinterstore(@RedisProtocolSupport.Key Buffer destination, long numkeys,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Intersect multiple sorted sets and store the resulting sorted set in a new key.
     *
     * @param destination the destination
     * @param numkeys the numkeys
     * @param keys the keys
     * @param weightses the weightses
     * @param aggregate the aggregate
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZINTERSTORE)
    public abstract Future<Long> zinterstore(@RedisProtocolSupport.Key Buffer destination, long numkeys,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.WEIGHTS) Collection<Long> weightses,
                                             @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZinterstoreAggregate aggregate);

    /**
     * Count the number of members in a sorted set between a given lexicographical range.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZLEXCOUNT)
    public abstract Future<Long> zlexcount(@RedisProtocolSupport.Key Buffer key, Buffer min, Buffer max);

    /**
     * Remove and return members with the highest scores in a sorted set.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZPOPMAX)
    public abstract <T> Future<List<T>> zpopmax(@RedisProtocolSupport.Key Buffer key);

    /**
     * Remove and return members with the highest scores in a sorted set.
     *
     * @param key the key
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZPOPMAX)
    public abstract <T> Future<List<T>> zpopmax(@RedisProtocolSupport.Key Buffer key, @Nullable Long count);

    /**
     * Remove and return members with the lowest scores in a sorted set.
     *
     * @param key the key
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZPOPMIN)
    public abstract <T> Future<List<T>> zpopmin(@RedisProtocolSupport.Key Buffer key);

    /**
     * Remove and return members with the lowest scores in a sorted set.
     *
     * @param key the key
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZPOPMIN)
    public abstract <T> Future<List<T>> zpopmin(@RedisProtocolSupport.Key Buffer key, @Nullable Long count);

    /**
     * Return a range of members in a sorted set, by index.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANGE)
    public abstract <T> Future<List<T>> zrange(@RedisProtocolSupport.Key Buffer key, long start, long stop);

    /**
     * Return a range of members in a sorted set, by index.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @param withscores the withscores
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANGE)
    public abstract <T> Future<List<T>> zrange(@RedisProtocolSupport.Key Buffer key, long start, long stop,
                                               @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZrangeWithscores withscores);

    /**
     * Return a range of members in a sorted set, by lexicographical range.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANGEBYLEX)
    public abstract <T> Future<List<T>> zrangebylex(@RedisProtocolSupport.Key Buffer key, Buffer min, Buffer max);

    /**
     * Return a range of members in a sorted set, by lexicographical range.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @param offsetCount the offsetCount
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANGEBYLEX)
    public abstract <T> Future<List<T>> zrangebylex(@RedisProtocolSupport.Key Buffer key, Buffer min, Buffer max,
                                                    @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIMIT) @Nullable @RedisProtocolSupport.Tuple RedisProtocolSupport.OffsetCount offsetCount);

    /**
     * Return a range of members in a sorted set, by score.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANGEBYSCORE)
    public abstract <T> Future<List<T>> zrangebyscore(@RedisProtocolSupport.Key Buffer key, double min, double max);

    /**
     * Return a range of members in a sorted set, by score.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @param withscores the withscores
     * @param offsetCount the offsetCount
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANGEBYSCORE)
    public abstract <T> Future<List<T>> zrangebyscore(@RedisProtocolSupport.Key Buffer key, double min, double max,
                                                      @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZrangebyscoreWithscores withscores,
                                                      @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIMIT) @Nullable @RedisProtocolSupport.Tuple RedisProtocolSupport.OffsetCount offsetCount);

    /**
     * Determine the index of a member in a sorted set.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZRANK)
    public abstract Future<Long> zrank(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Remove one or more members from a sorted set.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREM)
    public abstract Future<Long> zrem(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Remove one or more members from a sorted set.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREM)
    public abstract Future<Long> zrem(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2);

    /**
     * Remove one or more members from a sorted set.
     *
     * @param key the key
     * @param member1 the member1
     * @param member2 the member2
     * @param member3 the member3
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREM)
    public abstract Future<Long> zrem(@RedisProtocolSupport.Key Buffer key, Buffer member1, Buffer member2,
                                      Buffer member3);

    /**
     * Remove one or more members from a sorted set.
     *
     * @param key the key
     * @param members the members
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREM)
    public abstract Future<Long> zrem(@RedisProtocolSupport.Key Buffer key, Collection<Buffer> members);

    /**
     * Remove all members in a sorted set between the given lexicographical range.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREMRANGEBYLEX)
    public abstract Future<Long> zremrangebylex(@RedisProtocolSupport.Key Buffer key, Buffer min, Buffer max);

    /**
     * Remove all members in a sorted set within the given indexes.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREMRANGEBYRANK)
    public abstract Future<Long> zremrangebyrank(@RedisProtocolSupport.Key Buffer key, long start, long stop);

    /**
     * Remove all members in a sorted set within the given scores.
     *
     * @param key the key
     * @param min the min
     * @param max the max
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREMRANGEBYSCORE)
    public abstract Future<Long> zremrangebyscore(@RedisProtocolSupport.Key Buffer key, double min, double max);

    /**
     * Return a range of members in a sorted set, by index, with scores ordered from high to low.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANGE)
    public abstract <T> Future<List<T>> zrevrange(@RedisProtocolSupport.Key Buffer key, long start, long stop);

    /**
     * Return a range of members in a sorted set, by index, with scores ordered from high to low.
     *
     * @param key the key
     * @param start the start
     * @param stop the stop
     * @param withscores the withscores
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANGE)
    public abstract <T> Future<List<T>> zrevrange(@RedisProtocolSupport.Key Buffer key, long start, long stop,
                                                  @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZrevrangeWithscores withscores);

    /**
     * Return a range of members in a sorted set, by lexicographical range, ordered from higher to lower strings.
     *
     * @param key the key
     * @param max the max
     * @param min the min
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANGEBYLEX)
    public abstract <T> Future<List<T>> zrevrangebylex(@RedisProtocolSupport.Key Buffer key, Buffer max, Buffer min);

    /**
     * Return a range of members in a sorted set, by lexicographical range, ordered from higher to lower strings.
     *
     * @param key the key
     * @param max the max
     * @param min the min
     * @param offsetCount the offsetCount
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANGEBYLEX)
    public abstract <T> Future<List<T>> zrevrangebylex(@RedisProtocolSupport.Key Buffer key, Buffer max, Buffer min,
                                                       @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIMIT) @Nullable @RedisProtocolSupport.Tuple RedisProtocolSupport.OffsetCount offsetCount);

    /**
     * Return a range of members in a sorted set, by score, with scores ordered from high to low.
     *
     * @param key the key
     * @param max the max
     * @param min the min
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANGEBYSCORE)
    public abstract <T> Future<List<T>> zrevrangebyscore(@RedisProtocolSupport.Key Buffer key, double max, double min);

    /**
     * Return a range of members in a sorted set, by score, with scores ordered from high to low.
     *
     * @param key the key
     * @param max the max
     * @param min the min
     * @param withscores the withscores
     * @param offsetCount the offsetCount
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANGEBYSCORE)
    public abstract <T> Future<List<T>> zrevrangebyscore(@RedisProtocolSupport.Key Buffer key, double max, double min,
                                                         @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZrevrangebyscoreWithscores withscores,
                                                         @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.LIMIT) @Nullable @RedisProtocolSupport.Tuple RedisProtocolSupport.OffsetCount offsetCount);

    /**
     * Determine the index of a member in a sorted set, with scores ordered from high to low.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZREVRANK)
    public abstract Future<Long> zrevrank(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Incrementally iterate sorted sets elements and associated scores.
     *
     * @param key the key
     * @param cursor the cursor
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZSCAN)
    public abstract <T> Future<List<T>> zscan(@RedisProtocolSupport.Key Buffer key, long cursor);

    /**
     * Incrementally iterate sorted sets elements and associated scores.
     *
     * @param key the key
     * @param cursor the cursor
     * @param matchPattern the matchPattern
     * @param count the count
     * @return a {@link Future} result
     * @param <T> the type of elements
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZSCAN)
    public abstract <T> Future<List<T>> zscan(@RedisProtocolSupport.Key Buffer key, long cursor,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.MATCH) @Nullable Buffer matchPattern,
                                              @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.COUNT) @Nullable Long count);

    /**
     * Get the score associated with the given member in a sorted set.
     *
     * @param key the key
     * @param member the member
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZSCORE)
    public abstract Future<Double> zscore(@RedisProtocolSupport.Key Buffer key, Buffer member);

    /**
     * Add multiple sorted sets and store the resulting sorted set in a new key.
     *
     * @param destination the destination
     * @param numkeys the numkeys
     * @param keys the keys
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZUNIONSTORE)
    public abstract Future<Long> zunionstore(@RedisProtocolSupport.Key Buffer destination, long numkeys,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys);

    /**
     * Add multiple sorted sets and store the resulting sorted set in a new key.
     *
     * @param destination the destination
     * @param numkeys the numkeys
     * @param keys the keys
     * @param weightses the weightses
     * @param aggregate the aggregate
     * @return a {@link Future} result
     */
    @RedisProtocolSupport.Cmd(RedisProtocolSupport.Command.ZUNIONSTORE)
    public abstract Future<Long> zunionstore(@RedisProtocolSupport.Key Buffer destination, long numkeys,
                                             @RedisProtocolSupport.Key Collection<Buffer> keys,
                                             @RedisProtocolSupport.SubCmd(RedisProtocolSupport.SubCommand.WEIGHTS) Collection<Long> weightses,
                                             @RedisProtocolSupport.Option @Nullable RedisProtocolSupport.ZunionstoreAggregate aggregate);
}
