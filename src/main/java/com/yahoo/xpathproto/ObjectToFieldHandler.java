package com.yahoo.xpathproto;

import org.apache.commons.jxpath.JXPathContext;

import java.util.List;

import com.yahoo.xpathproto.dataobject.Config;
import com.yahoo.xpathproto.dataobject.Context;

/**
 * The Interface ObjectToFieldHandler. It is used to define a custom handler to take care of objects that map to a field
 * in the protobuf. It also has support for repeated proto values. In case repeated fields are not supported, an
 * UnsupportedOperationException can be thrown in the method definition.
 */
public interface ObjectToFieldHandler {

    Object getProtoValue(JXPathContext context, Context vars, Config.Entry entry);

    List<Object> getRepeatedProtoValue(JXPathContext context, Context vars, Config.Entry entry);
}
