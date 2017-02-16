import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Set;

/**
 * User：    ysl
 * Date:   2017/2/8
 * Time:   18:54
 */
public class TestSentinel {

    public static void main(String[] args)
    {
        test1();
    }

        public static void test1() {
                JedisPoolConfig poolConfig = new JedisPoolConfig();
                String masterName = "identification_test";
                Set<String> sentinels = new HashSet<String>();
                 sentinels.add("172.20.33.1:26379");
                 sentinels.add("172.20.33.2:26379");
                 sentinels.add("172.20.33.3:26379");
                 JedisSentinelPool jedisSentinelPool = new JedisSentinelPool(masterName, sentinels, poolConfig);
                 HostAndPort currentHostMaster = jedisSentinelPool.getCurrentHostMaster();
                 System.out.println(currentHostMaster.getHost()+"--"+currentHostMaster.getPort());//获取主节点的信息
                 Jedis resource = jedisSentinelPool.getResource();
                 String value = resource.get("a");
                 System.out.println(value);//获得键a对应的value值
                 resource.close();
             }
}
