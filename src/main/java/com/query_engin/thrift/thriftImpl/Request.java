package com.query_engin.thrift.thriftImpl; /**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-10")
public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable, Comparable<Request> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField QUERYTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("querytype", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GET_USER_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("get_user_user_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ADD_USER_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("add_user_user", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField GET_WORD_WORD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("get_word_word_id", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ADD_WORD_WORD_FIELD_DESC = new org.apache.thrift.protocol.TField("add_word_word", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField ADD_TOKEN_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("add_token_token", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField GET_TOKEN_TOKEN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("get_token_token_name", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
  }

  /**
   * 
   * @see QueryType
   */
  public QueryType querytype; // required
  public long get_user_user_id; // optional
  public User add_user_user; // optional
  public long get_word_word_id; // optional
  public Word add_word_word; // optional
  public Token add_token_token; // optional
  public String get_token_token_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see QueryType
     */
    QUERYTYPE((short)1, "querytype"),
    GET_USER_USER_ID((short)2, "get_user_user_id"),
    ADD_USER_USER((short)3, "add_user_user"),
    GET_WORD_WORD_ID((short)4, "get_word_word_id"),
    ADD_WORD_WORD((short)5, "add_word_word"),
    ADD_TOKEN_TOKEN((short)6, "add_token_token"),
    GET_TOKEN_TOKEN_NAME((short)7, "get_token_token_name");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUERYTYPE
          return QUERYTYPE;
        case 2: // GET_USER_USER_ID
          return GET_USER_USER_ID;
        case 3: // ADD_USER_USER
          return ADD_USER_USER;
        case 4: // GET_WORD_WORD_ID
          return GET_WORD_WORD_ID;
        case 5: // ADD_WORD_WORD
          return ADD_WORD_WORD;
        case 6: // ADD_TOKEN_TOKEN
          return ADD_TOKEN_TOKEN;
        case 7: // GET_TOKEN_TOKEN_NAME
          return GET_TOKEN_TOKEN_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GET_USER_USER_ID_ISSET_ID = 0;
  private static final int __GET_WORD_WORD_ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GET_USER_USER_ID,_Fields.ADD_USER_USER,_Fields.GET_WORD_WORD_ID,_Fields.ADD_WORD_WORD,_Fields.ADD_TOKEN_TOKEN,_Fields.GET_TOKEN_TOKEN_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERYTYPE, new org.apache.thrift.meta_data.FieldMetaData("querytype", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, QueryType.class)));
    tmpMap.put(_Fields.GET_USER_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("get_user_user_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ADD_USER_USER, new org.apache.thrift.meta_data.FieldMetaData("add_user_user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, User.class)));
    tmpMap.put(_Fields.GET_WORD_WORD_ID, new org.apache.thrift.meta_data.FieldMetaData("get_word_word_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ADD_WORD_WORD, new org.apache.thrift.meta_data.FieldMetaData("add_word_word", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Word.class)));
    tmpMap.put(_Fields.ADD_TOKEN_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("add_token_token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Token.class)));
    tmpMap.put(_Fields.GET_TOKEN_TOKEN_NAME, new org.apache.thrift.meta_data.FieldMetaData("get_token_token_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    QueryType querytype)
  {
    this();
    this.querytype = querytype;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQuerytype()) {
      this.querytype = other.querytype;
    }
    this.get_user_user_id = other.get_user_user_id;
    if (other.isSetAdd_user_user()) {
      this.add_user_user = new User(other.add_user_user);
    }
    this.get_word_word_id = other.get_word_word_id;
    if (other.isSetAdd_word_word()) {
      this.add_word_word = new Word(other.add_word_word);
    }
    if (other.isSetAdd_token_token()) {
      this.add_token_token = new Token(other.add_token_token);
    }
    if (other.isSetGet_token_token_name()) {
      this.get_token_token_name = other.get_token_token_name;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    this.querytype = null;
    setGet_user_user_idIsSet(false);
    this.get_user_user_id = 0;
    this.add_user_user = null;
    setGet_word_word_idIsSet(false);
    this.get_word_word_id = 0;
    this.add_word_word = null;
    this.add_token_token = null;
    this.get_token_token_name = null;
  }

  /**
   * 
   * @see QueryType
   */
  public QueryType getQuerytype() {
    return this.querytype;
  }

  /**
   * 
   * @see QueryType
   */
  public Request setQuerytype(QueryType querytype) {
    this.querytype = querytype;
    return this;
  }

  public void unsetQuerytype() {
    this.querytype = null;
  }

  /** Returns true if field querytype is set (has been assigned a value) and false otherwise */
  public boolean isSetQuerytype() {
    return this.querytype != null;
  }

  public void setQuerytypeIsSet(boolean value) {
    if (!value) {
      this.querytype = null;
    }
  }

  public long getGet_user_user_id() {
    return this.get_user_user_id;
  }

  public Request setGet_user_user_id(long get_user_user_id) {
    this.get_user_user_id = get_user_user_id;
    setGet_user_user_idIsSet(true);
    return this;
  }

  public void unsetGet_user_user_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GET_USER_USER_ID_ISSET_ID);
  }

  /** Returns true if field get_user_user_id is set (has been assigned a value) and false otherwise */
  public boolean isSetGet_user_user_id() {
    return EncodingUtils.testBit(__isset_bitfield, __GET_USER_USER_ID_ISSET_ID);
  }

  public void setGet_user_user_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GET_USER_USER_ID_ISSET_ID, value);
  }

  public User getAdd_user_user() {
    return this.add_user_user;
  }

  public Request setAdd_user_user(User add_user_user) {
    this.add_user_user = add_user_user;
    return this;
  }

  public void unsetAdd_user_user() {
    this.add_user_user = null;
  }

  /** Returns true if field add_user_user is set (has been assigned a value) and false otherwise */
  public boolean isSetAdd_user_user() {
    return this.add_user_user != null;
  }

  public void setAdd_user_userIsSet(boolean value) {
    if (!value) {
      this.add_user_user = null;
    }
  }

  public long getGet_word_word_id() {
    return this.get_word_word_id;
  }

  public Request setGet_word_word_id(long get_word_word_id) {
    this.get_word_word_id = get_word_word_id;
    setGet_word_word_idIsSet(true);
    return this;
  }

  public void unsetGet_word_word_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GET_WORD_WORD_ID_ISSET_ID);
  }

  /** Returns true if field get_word_word_id is set (has been assigned a value) and false otherwise */
  public boolean isSetGet_word_word_id() {
    return EncodingUtils.testBit(__isset_bitfield, __GET_WORD_WORD_ID_ISSET_ID);
  }

  public void setGet_word_word_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GET_WORD_WORD_ID_ISSET_ID, value);
  }

  public Word getAdd_word_word() {
    return this.add_word_word;
  }

  public Request setAdd_word_word(Word add_word_word) {
    this.add_word_word = add_word_word;
    return this;
  }

  public void unsetAdd_word_word() {
    this.add_word_word = null;
  }

  /** Returns true if field add_word_word is set (has been assigned a value) and false otherwise */
  public boolean isSetAdd_word_word() {
    return this.add_word_word != null;
  }

  public void setAdd_word_wordIsSet(boolean value) {
    if (!value) {
      this.add_word_word = null;
    }
  }

  public Token getAdd_token_token() {
    return this.add_token_token;
  }

  public Request setAdd_token_token(Token add_token_token) {
    this.add_token_token = add_token_token;
    return this;
  }

  public void unsetAdd_token_token() {
    this.add_token_token = null;
  }

  /** Returns true if field add_token_token is set (has been assigned a value) and false otherwise */
  public boolean isSetAdd_token_token() {
    return this.add_token_token != null;
  }

  public void setAdd_token_tokenIsSet(boolean value) {
    if (!value) {
      this.add_token_token = null;
    }
  }

  public String getGet_token_token_name() {
    return this.get_token_token_name;
  }

  public Request setGet_token_token_name(String get_token_token_name) {
    this.get_token_token_name = get_token_token_name;
    return this;
  }

  public void unsetGet_token_token_name() {
    this.get_token_token_name = null;
  }

  /** Returns true if field get_token_token_name is set (has been assigned a value) and false otherwise */
  public boolean isSetGet_token_token_name() {
    return this.get_token_token_name != null;
  }

  public void setGet_token_token_nameIsSet(boolean value) {
    if (!value) {
      this.get_token_token_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERYTYPE:
      if (value == null) {
        unsetQuerytype();
      } else {
        setQuerytype((QueryType)value);
      }
      break;

    case GET_USER_USER_ID:
      if (value == null) {
        unsetGet_user_user_id();
      } else {
        setGet_user_user_id((Long)value);
      }
      break;

    case ADD_USER_USER:
      if (value == null) {
        unsetAdd_user_user();
      } else {
        setAdd_user_user((User)value);
      }
      break;

    case GET_WORD_WORD_ID:
      if (value == null) {
        unsetGet_word_word_id();
      } else {
        setGet_word_word_id((Long)value);
      }
      break;

    case ADD_WORD_WORD:
      if (value == null) {
        unsetAdd_word_word();
      } else {
        setAdd_word_word((Word)value);
      }
      break;

    case ADD_TOKEN_TOKEN:
      if (value == null) {
        unsetAdd_token_token();
      } else {
        setAdd_token_token((Token)value);
      }
      break;

    case GET_TOKEN_TOKEN_NAME:
      if (value == null) {
        unsetGet_token_token_name();
      } else {
        setGet_token_token_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERYTYPE:
      return getQuerytype();

    case GET_USER_USER_ID:
      return getGet_user_user_id();

    case ADD_USER_USER:
      return getAdd_user_user();

    case GET_WORD_WORD_ID:
      return getGet_word_word_id();

    case ADD_WORD_WORD:
      return getAdd_word_word();

    case ADD_TOKEN_TOKEN:
      return getAdd_token_token();

    case GET_TOKEN_TOKEN_NAME:
      return getGet_token_token_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERYTYPE:
      return isSetQuerytype();
    case GET_USER_USER_ID:
      return isSetGet_user_user_id();
    case ADD_USER_USER:
      return isSetAdd_user_user();
    case GET_WORD_WORD_ID:
      return isSetGet_word_word_id();
    case ADD_WORD_WORD:
      return isSetAdd_word_word();
    case ADD_TOKEN_TOKEN:
      return isSetAdd_token_token();
    case GET_TOKEN_TOKEN_NAME:
      return isSetGet_token_token_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;

    boolean this_present_querytype = true && this.isSetQuerytype();
    boolean that_present_querytype = true && that.isSetQuerytype();
    if (this_present_querytype || that_present_querytype) {
      if (!(this_present_querytype && that_present_querytype))
        return false;
      if (!this.querytype.equals(that.querytype))
        return false;
    }

    boolean this_present_get_user_user_id = true && this.isSetGet_user_user_id();
    boolean that_present_get_user_user_id = true && that.isSetGet_user_user_id();
    if (this_present_get_user_user_id || that_present_get_user_user_id) {
      if (!(this_present_get_user_user_id && that_present_get_user_user_id))
        return false;
      if (this.get_user_user_id != that.get_user_user_id)
        return false;
    }

    boolean this_present_add_user_user = true && this.isSetAdd_user_user();
    boolean that_present_add_user_user = true && that.isSetAdd_user_user();
    if (this_present_add_user_user || that_present_add_user_user) {
      if (!(this_present_add_user_user && that_present_add_user_user))
        return false;
      if (!this.add_user_user.equals(that.add_user_user))
        return false;
    }

    boolean this_present_get_word_word_id = true && this.isSetGet_word_word_id();
    boolean that_present_get_word_word_id = true && that.isSetGet_word_word_id();
    if (this_present_get_word_word_id || that_present_get_word_word_id) {
      if (!(this_present_get_word_word_id && that_present_get_word_word_id))
        return false;
      if (this.get_word_word_id != that.get_word_word_id)
        return false;
    }

    boolean this_present_add_word_word = true && this.isSetAdd_word_word();
    boolean that_present_add_word_word = true && that.isSetAdd_word_word();
    if (this_present_add_word_word || that_present_add_word_word) {
      if (!(this_present_add_word_word && that_present_add_word_word))
        return false;
      if (!this.add_word_word.equals(that.add_word_word))
        return false;
    }

    boolean this_present_add_token_token = true && this.isSetAdd_token_token();
    boolean that_present_add_token_token = true && that.isSetAdd_token_token();
    if (this_present_add_token_token || that_present_add_token_token) {
      if (!(this_present_add_token_token && that_present_add_token_token))
        return false;
      if (!this.add_token_token.equals(that.add_token_token))
        return false;
    }

    boolean this_present_get_token_token_name = true && this.isSetGet_token_token_name();
    boolean that_present_get_token_token_name = true && that.isSetGet_token_token_name();
    if (this_present_get_token_token_name || that_present_get_token_token_name) {
      if (!(this_present_get_token_token_name && that_present_get_token_token_name))
        return false;
      if (!this.get_token_token_name.equals(that.get_token_token_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_querytype = true && (isSetQuerytype());
    list.add(present_querytype);
    if (present_querytype)
      list.add(querytype.getValue());

    boolean present_get_user_user_id = true && (isSetGet_user_user_id());
    list.add(present_get_user_user_id);
    if (present_get_user_user_id)
      list.add(get_user_user_id);

    boolean present_add_user_user = true && (isSetAdd_user_user());
    list.add(present_add_user_user);
    if (present_add_user_user)
      list.add(add_user_user);

    boolean present_get_word_word_id = true && (isSetGet_word_word_id());
    list.add(present_get_word_word_id);
    if (present_get_word_word_id)
      list.add(get_word_word_id);

    boolean present_add_word_word = true && (isSetAdd_word_word());
    list.add(present_add_word_word);
    if (present_add_word_word)
      list.add(add_word_word);

    boolean present_add_token_token = true && (isSetAdd_token_token());
    list.add(present_add_token_token);
    if (present_add_token_token)
      list.add(add_token_token);

    boolean present_get_token_token_name = true && (isSetGet_token_token_name());
    list.add(present_get_token_token_name);
    if (present_get_token_token_name)
      list.add(get_token_token_name);

    return list.hashCode();
  }

  @Override
  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuerytype()).compareTo(other.isSetQuerytype());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuerytype()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.querytype, other.querytype);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGet_user_user_id()).compareTo(other.isSetGet_user_user_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGet_user_user_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.get_user_user_id, other.get_user_user_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdd_user_user()).compareTo(other.isSetAdd_user_user());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdd_user_user()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.add_user_user, other.add_user_user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGet_word_word_id()).compareTo(other.isSetGet_word_word_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGet_word_word_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.get_word_word_id, other.get_word_word_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdd_word_word()).compareTo(other.isSetAdd_word_word());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdd_word_word()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.add_word_word, other.add_word_word);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdd_token_token()).compareTo(other.isSetAdd_token_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdd_token_token()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.add_token_token, other.add_token_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGet_token_token_name()).compareTo(other.isSetGet_token_token_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGet_token_token_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.get_token_token_name, other.get_token_token_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;

    sb.append("querytype:");
    if (this.querytype == null) {
      sb.append("null");
    } else {
      sb.append(this.querytype);
    }
    first = false;
    if (isSetGet_user_user_id()) {
      if (!first) sb.append(", ");
      sb.append("get_user_user_id:");
      sb.append(this.get_user_user_id);
      first = false;
    }
    if (isSetAdd_user_user()) {
      if (!first) sb.append(", ");
      sb.append("add_user_user:");
      if (this.add_user_user == null) {
        sb.append("null");
      } else {
        sb.append(this.add_user_user);
      }
      first = false;
    }
    if (isSetGet_word_word_id()) {
      if (!first) sb.append(", ");
      sb.append("get_word_word_id:");
      sb.append(this.get_word_word_id);
      first = false;
    }
    if (isSetAdd_word_word()) {
      if (!first) sb.append(", ");
      sb.append("add_word_word:");
      if (this.add_word_word == null) {
        sb.append("null");
      } else {
        sb.append(this.add_word_word);
      }
      first = false;
    }
    if (isSetAdd_token_token()) {
      if (!first) sb.append(", ");
      sb.append("add_token_token:");
      if (this.add_token_token == null) {
        sb.append("null");
      } else {
        sb.append(this.add_token_token);
      }
      first = false;
    }
    if (isSetGet_token_token_name()) {
      if (!first) sb.append(", ");
      sb.append("get_token_token_name:");
      if (this.get_token_token_name == null) {
        sb.append("null");
      } else {
        sb.append(this.get_token_token_name);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (querytype == null) {
      throw new TProtocolException("Required field 'querytype' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (add_user_user != null) {
      add_user_user.validate();
    }
    if (add_word_word != null) {
      add_word_word.validate();
    }
    if (add_token_token != null) {
      add_token_token.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RequestStandardSchemeFactory implements SchemeFactory {
    public RequestStandardScheme getScheme() {
      return new RequestStandardScheme();
    }
  }

  private static class RequestStandardScheme extends StandardScheme<Request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUERYTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.querytype = QueryType.findByValue(iprot.readI32());
              struct.setQuerytypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GET_USER_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.get_user_user_id = iprot.readI64();
              struct.setGet_user_user_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADD_USER_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.add_user_user = new User();
              struct.add_user_user.read(iprot);
              struct.setAdd_user_userIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GET_WORD_WORD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.get_word_word_id = iprot.readI64();
              struct.setGet_word_word_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ADD_WORD_WORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.add_word_word = new Word();
              struct.add_word_word.read(iprot);
              struct.setAdd_word_wordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ADD_TOKEN_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.add_token_token = new Token();
              struct.add_token_token.read(iprot);
              struct.setAdd_token_tokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // GET_TOKEN_TOKEN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.get_token_token_name = iprot.readString();
              struct.setGet_token_token_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.querytype != null) {
        oprot.writeFieldBegin(QUERYTYPE_FIELD_DESC);
        oprot.writeI32(struct.querytype.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetGet_user_user_id()) {
        oprot.writeFieldBegin(GET_USER_USER_ID_FIELD_DESC);
        oprot.writeI64(struct.get_user_user_id);
        oprot.writeFieldEnd();
      }
      if (struct.add_user_user != null) {
        if (struct.isSetAdd_user_user()) {
          oprot.writeFieldBegin(ADD_USER_USER_FIELD_DESC);
          struct.add_user_user.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetGet_word_word_id()) {
        oprot.writeFieldBegin(GET_WORD_WORD_ID_FIELD_DESC);
        oprot.writeI64(struct.get_word_word_id);
        oprot.writeFieldEnd();
      }
      if (struct.add_word_word != null) {
        if (struct.isSetAdd_word_word()) {
          oprot.writeFieldBegin(ADD_WORD_WORD_FIELD_DESC);
          struct.add_word_word.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.add_token_token != null) {
        if (struct.isSetAdd_token_token()) {
          oprot.writeFieldBegin(ADD_TOKEN_TOKEN_FIELD_DESC);
          struct.add_token_token.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.get_token_token_name != null) {
        if (struct.isSetGet_token_token_name()) {
          oprot.writeFieldBegin(GET_TOKEN_TOKEN_NAME_FIELD_DESC);
          oprot.writeString(struct.get_token_token_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestTupleSchemeFactory implements SchemeFactory {
    public RequestTupleScheme getScheme() {
      return new RequestTupleScheme();
    }
  }

  private static class RequestTupleScheme extends TupleScheme<Request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.querytype.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetGet_user_user_id()) {
        optionals.set(0);
      }
      if (struct.isSetAdd_user_user()) {
        optionals.set(1);
      }
      if (struct.isSetGet_word_word_id()) {
        optionals.set(2);
      }
      if (struct.isSetAdd_word_word()) {
        optionals.set(3);
      }
      if (struct.isSetAdd_token_token()) {
        optionals.set(4);
      }
      if (struct.isSetGet_token_token_name()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetGet_user_user_id()) {
        oprot.writeI64(struct.get_user_user_id);
      }
      if (struct.isSetAdd_user_user()) {
        struct.add_user_user.write(oprot);
      }
      if (struct.isSetGet_word_word_id()) {
        oprot.writeI64(struct.get_word_word_id);
      }
      if (struct.isSetAdd_word_word()) {
        struct.add_word_word.write(oprot);
      }
      if (struct.isSetAdd_token_token()) {
        struct.add_token_token.write(oprot);
      }
      if (struct.isSetGet_token_token_name()) {
        oprot.writeString(struct.get_token_token_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.querytype = QueryType.findByValue(iprot.readI32());
      struct.setQuerytypeIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.get_user_user_id = iprot.readI64();
        struct.setGet_user_user_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.add_user_user = new User();
        struct.add_user_user.read(iprot);
        struct.setAdd_user_userIsSet(true);
      }
      if (incoming.get(2)) {
        struct.get_word_word_id = iprot.readI64();
        struct.setGet_word_word_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.add_word_word = new Word();
        struct.add_word_word.read(iprot);
        struct.setAdd_word_wordIsSet(true);
      }
      if (incoming.get(4)) {
        struct.add_token_token = new Token();
        struct.add_token_token.read(iprot);
        struct.setAdd_token_tokenIsSet(true);
      }
      if (incoming.get(5)) {
        struct.get_token_token_name = iprot.readString();
        struct.setGet_token_token_nameIsSet(true);
      }
    }
  }

}

