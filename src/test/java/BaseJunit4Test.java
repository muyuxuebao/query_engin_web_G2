import com.query_engin.thrift.thriftImpl.RedisProxyService;
import com.query_engin.thrift.thriftImpl.User;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yinliang on 2016/4/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit4���в���
@ContextConfiguration
        (locations = "classpath:mvc-dispatcher-servlet.xml") //���������ļ�

//------------����������´��룬���м̳и���Ĳ����඼����ѭ�����ã�Ҳ���Բ��ӣ��ڲ�����ķ�����///�������񣬲μ���һ��ʵ��
//����ǳ��ؼ���������������ע�����ã�������ƾͻ���ȫʧЧ��
//@Transactional
//�������������������ļ��е������������transactionManager = "transactionManager"����ͬʱ//ָ���Զ��ع���defaultRollback = true�������������������ݲŲ�����Ⱦ���ݿ⣡
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//------------
public class BaseJunit4Test {
}
