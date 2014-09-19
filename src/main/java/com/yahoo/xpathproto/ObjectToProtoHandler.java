package com.yahoo.xpathproto;

import org.apache.commons.jxpath.JXPathContext;

import java.util.List;

import com.yahoo.xpathproto.dataobject.Config;
import com.yahoo.xpathproto.dataobject.Context;

import com.google.protobuf.Message;

/**
 * The Interface ObjectToProtoHandler. It is used to define a custom handler to take care of objects that map to an
 * entire message in the protobuf. It also has support for repeated proto values. In case repeated fields are not
 * supported, an UnsupportedOperationException can be thrown in the method definition.
 */
public interface ObjectToProtoHandler {

    Message.Builder getProtoBuilder(JXPathContext context, Context vars, Config.Entry entry);

    List<Message.Builder> getRepeatedProtoBuilder(JXPathContext context, Context vars, Config.Entry entry);
}
