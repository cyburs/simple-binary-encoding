/* Generated SBE (Simple Binary Encoding) message codec */
package uk.co.real_logic.sbe.ir.generated;

import uk.co.real_logic.agrona.MutableDirectBuffer;

@javax.annotation.Generated(value = {"uk.co.real_logic.sbe.ir.generated.TokenCodecEncoder"})
@SuppressWarnings("all")
public class TokenCodecEncoder
{
    public static final int BLOCK_LENGTH = 24;
    public static final int TEMPLATE_ID = 2;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;

    private final TokenCodecEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public int offset()
    {
        return offset;
    }

    public TokenCodecEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);
        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int tokenOffsetNullValue()
    {
        return -2147483648;
    }

    public static int tokenOffsetMinValue()
    {
        return -2147483647;
    }

    public static int tokenOffsetMaxValue()
    {
        return 2147483647;
    }

    public TokenCodecEncoder tokenOffset(final int value)
    {
        buffer.putInt(offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tokenSizeNullValue()
    {
        return -2147483648;
    }

    public static int tokenSizeMinValue()
    {
        return -2147483647;
    }

    public static int tokenSizeMaxValue()
    {
        return 2147483647;
    }

    public TokenCodecEncoder tokenSize(final int value)
    {
        buffer.putInt(offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int fieldIdNullValue()
    {
        return -2147483648;
    }

    public static int fieldIdMinValue()
    {
        return -2147483647;
    }

    public static int fieldIdMaxValue()
    {
        return 2147483647;
    }

    public TokenCodecEncoder fieldId(final int value)
    {
        buffer.putInt(offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tokenVersionNullValue()
    {
        return -2147483648;
    }

    public static int tokenVersionMinValue()
    {
        return -2147483647;
    }

    public static int tokenVersionMaxValue()
    {
        return 2147483647;
    }

    public TokenCodecEncoder tokenVersion(final int value)
    {
        buffer.putInt(offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int componentTokenCountNullValue()
    {
        return -2147483648;
    }

    public static int componentTokenCountMinValue()
    {
        return -2147483647;
    }

    public static int componentTokenCountMaxValue()
    {
        return 2147483647;
    }

    public TokenCodecEncoder componentTokenCount(final int value)
    {
        buffer.putInt(offset + 16, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public TokenCodecEncoder signal(final SignalCodec value)
    {
        buffer.putByte(offset + 20, (byte)value.value());
        return this;
    }
    public TokenCodecEncoder primitiveType(final PrimitiveTypeCodec value)
    {
        buffer.putByte(offset + 21, (byte)value.value());
        return this;
    }
    public TokenCodecEncoder byteOrder(final ByteOrderCodec value)
    {
        buffer.putByte(offset + 22, (byte)value.value());
        return this;
    }
    public TokenCodecEncoder presence(final PresenceCodec value)
    {
        buffer.putByte(offset + 23, (byte)value.value());
        return this;
    }

    public static int nameId()
    {
        return 20;
    }

    public static String nameCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String nameMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putName(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putName(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder name(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int constValueId()
    {
        return 21;
    }

    public static String constValueCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String constValueMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putConstValue(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putConstValue(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder constValue(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int minValueId()
    {
        return 22;
    }

    public static String minValueCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String minValueMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putMinValue(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putMinValue(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder minValue(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int maxValueId()
    {
        return 23;
    }

    public static String maxValueCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String maxValueMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putMaxValue(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putMaxValue(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder maxValue(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int nullValueId()
    {
        return 24;
    }

    public static String nullValueCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String nullValueMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putNullValue(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putNullValue(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder nullValue(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int characterEncodingId()
    {
        return 25;
    }

    public static String characterEncodingCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String characterEncodingMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putCharacterEncoding(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putCharacterEncoding(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder characterEncoding(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int epochId()
    {
        return 26;
    }

    public static String epochCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String epochMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putEpoch(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putEpoch(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder epoch(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int timeUnitId()
    {
        return 27;
    }

    public static String timeUnitCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String timeUnitMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putTimeUnit(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putTimeUnit(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder timeUnit(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int semanticTypeId()
    {
        return 28;
    }

    public static String semanticTypeCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String semanticTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putSemanticType(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putSemanticType(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder semanticType(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }

    public static int descriptionId()
    {
        return 29;
    }

    public static String descriptionCharacterEncoding()
    {
        return "UTF-8";
    }

    public static String descriptionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public int putDescription(
        final uk.co.real_logic.agrona.DirectBuffer src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public int putDescription(
        final byte[] src, final int srcOffset, final int length)
    {
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, src, srcOffset, length);

        return length;
    }

    public TokenCodecEncoder description(final String value)
    {
        final byte[] bytes;
        try
        {
            bytes = value.getBytes("UTF-8");
        }
        catch (final java.io.UnsupportedEncodingException ex)
        {
            throw new RuntimeException(ex);
        }

        final int length = bytes.length;
        final int sizeOfLengthField = 1;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + sizeOfLengthField + length);
        final short l = (short)length;
        buffer.putByte(limit, (byte)l);
        buffer.putBytes(limit + sizeOfLengthField, bytes, 0, length);

        return this;
    }
}
