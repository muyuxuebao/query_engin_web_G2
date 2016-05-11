import com.query_engin.thrift.ThriftProxy;
import com.query_engin.thrift.thriftImpl.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinliang on 2016/5/9.
 */
public class RedisProxyTest extends BaseJunit4Test {
    @Autowired
    TTransport transport;
    @Autowired
    ThriftProxy thriftProxy;

    @Before
    public void init() throws TTransportException {
        System.out.println("Test begin");
        transport.open();
    }

    @After
    public void exit() {
        transport.close();
        System.out.println("Test end");
    }

    @Test
    public void testUser() throws TException {
        User user = new User();
        user.setName("中国AB}CD粉丝大分散到");
        long id = thriftProxy.addUser(user);

        User user1 = thriftProxy.getUser(id);
        System.out.println(user1);
    }


    @Test
    public void testWord() throws TException {
        Word user = new Word();
        user.setName("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
        long id = thriftProxy.addWord(user);

        Word user1 = thriftProxy.getWord(id);
        System.out.println(user1);
    }

    @Test
    public void testToken() throws TException {
        Token token = new Token();
        token.setName("A中B国");

        List<TokenItem> ls = new ArrayList<TokenItem>();
        ls.add(new TokenItem(1, 1, 100, 999));

        token.setTokenItemVetor(ls);

        thriftProxy.addToken(token);

        Token token1 = thriftProxy.getToken(token.name);

//        System.out.println(token1);


        List<Token> tokens = thriftProxy.getAllToken();
        for (Token token2 : tokens) {
            System.out.println(token2);
        }
    }

    @Test
    public void testUserBuyWord() throws TException {
        String ts = "ABCD中E国FG";

        Word word = new Word();
        word.setName(ts);
        User user = new User();
        user.setName("zhangsan");

        this.thriftProxy.userBuyWord(user, word);
    }

}
