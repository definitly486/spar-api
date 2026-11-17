package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    private static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i13) {
            super();
            if (i13 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i13, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        final void buffer(byte b13) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            bArr[i13] = b13;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i13) {
            byte[] bArr = this.buffer;
            int i14 = this.position;
            int i15 = i14 + 1;
            this.position = i15;
            bArr[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i14 + 2;
            this.position = i16;
            bArr[i15] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i17 = i14 + 3;
            this.position = i17;
            bArr[i16] = (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.position = i14 + 4;
            bArr[i17] = (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j13) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            int i14 = i13 + 1;
            this.position = i14;
            bArr[i13] = (byte) (j13 & 255);
            int i15 = i13 + 2;
            this.position = i15;
            bArr[i14] = (byte) ((j13 >> 8) & 255);
            int i16 = i13 + 3;
            this.position = i16;
            bArr[i15] = (byte) ((j13 >> 16) & 255);
            int i17 = i13 + 4;
            this.position = i17;
            bArr[i16] = (byte) (255 & (j13 >> 24));
            int i18 = i13 + 5;
            this.position = i18;
            bArr[i17] = (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i19 = i13 + 6;
            this.position = i19;
            bArr[i18] = (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i23 = i13 + 7;
            this.position = i23;
            bArr[i19] = (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.position = i13 + 8;
            bArr[i23] = (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i13) {
            if (i13 >= 0) {
                bufferUInt32NoTag(i13);
            } else {
                bufferUInt64NoTag(i13);
            }
        }

        final void bufferTag(int i13, int i14) {
            bufferUInt32NoTag(WireFormat.makeTag(i13, i14));
        }

        final void bufferUInt32NoTag(int i13) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i13 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i14 = this.position;
                    this.position = i14 + 1;
                    bArr[i14] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.totalBytesWritten++;
                    i13 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                bArr2[i15] = (byte) i13;
                this.totalBytesWritten++;
                return;
            }
            long j13 = this.position;
            while ((i13 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i16 = this.position;
                this.position = i16 + 1;
                UnsafeUtil.putByte(bArr3, i16, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                i13 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i17 = this.position;
            this.position = i17 + 1;
            UnsafeUtil.putByte(bArr4, i17, (byte) i13);
            this.totalBytesWritten += (int) (((long) this.position) - j13);
        }

        final void bufferUInt64NoTag(long j13) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j13 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    bArr[i13] = (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.totalBytesWritten++;
                    j13 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                bArr2[i14] = (byte) j13;
                this.totalBytesWritten++;
                return;
            }
            long j14 = this.position;
            while ((j13 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                UnsafeUtil.putByte(bArr3, i15, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j13 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i16 = this.position;
            this.position = i16 + 1;
            UnsafeUtil.putByte(bArr4, i16, (byte) j13);
            this.totalBytesWritten += (int) (((long) this.position) - j14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] bArr, int i13, int i14) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i15 = i13 + i14;
            if ((i13 | i14 | (bArr.length - i15)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            this.buffer = bArr;
            this.offset = i13;
            this.position = i13;
            this.limit = i15;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b13) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                bArr[i13] = b13;
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i13, boolean z13) throws IOException {
            writeTag(i13, 0);
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i13, byte[] bArr) throws IOException {
            writeByteArray(i13, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i13, int i14) throws IOException {
            writeUInt32NoTag(i14);
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i13, ByteBuffer byteBuffer) throws IOException {
            writeTag(i13, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i13, ByteString byteString) throws IOException {
            writeTag(i13, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i13, int i14) throws IOException {
            writeTag(i13, 5);
            writeFixed32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i13) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i14 = this.position;
                int i15 = i14 + 1;
                this.position = i15;
                bArr[i14] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                int i16 = i14 + 2;
                this.position = i16;
                bArr[i15] = (byte) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i17 = i14 + 3;
                this.position = i17;
                bArr[i16] = (byte) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.position = i14 + 4;
                bArr[i17] = (byte) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i13, long j13) throws IOException {
            writeTag(i13, 1);
            writeFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j13) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i13 = this.position;
                int i14 = i13 + 1;
                this.position = i14;
                bArr[i13] = (byte) (((int) j13) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i15 = i13 + 2;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j13 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i16 = i13 + 3;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j13 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i17 = i13 + 4;
                this.position = i17;
                bArr[i16] = (byte) (((int) (j13 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i18 = i13 + 5;
                this.position = i18;
                bArr[i17] = (byte) (((int) (j13 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i19 = i13 + 6;
                this.position = i19;
                bArr[i18] = (byte) (((int) (j13 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                int i23 = i13 + 7;
                this.position = i23;
                bArr[i19] = (byte) (((int) (j13 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.position = i13 + 8;
                bArr[i23] = (byte) (((int) (j13 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i13, int i14) throws IOException {
            writeTag(i13, 0);
            writeInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i13) throws IOException {
            if (i13 >= 0) {
                writeUInt32NoTag(i13);
            } else {
                writeUInt64NoTag(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i13, int i14) throws IOException {
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i13, MessageLite messageLite) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i13, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i13, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i13, String str) throws IOException {
            writeTag(i13, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i13 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i14 = i13 + iComputeUInt32SizeNoTag2;
                    this.position = i14;
                    int iEncode = Utf8.encode(str, this.buffer, i14, spaceLeft());
                    this.position = i13;
                    writeUInt32NoTag((iEncode - i13) - iComputeUInt32SizeNoTag2);
                    this.position = iEncode;
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e13) {
                this.position = i13;
                inefficientWriteStringNoTag(str, e13);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i13, int i14) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i13, int i14) throws IOException {
            writeTag(i13, 0);
            writeUInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i13) throws IOException {
            while ((i13 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i14 = this.position;
                    this.position = i14 + 1;
                    bArr[i14] = (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e13);
                }
            }
            byte[] bArr2 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            bArr2[i15] = (byte) i13;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i13, long j13) throws IOException {
            writeTag(i13, 0);
            writeUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j13) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j13 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    UnsafeUtil.putByte(bArr, i13, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                UnsafeUtil.putByte(bArr2, i14, (byte) j13);
                return;
            }
            while ((j13 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i15 = this.position;
                    this.position = i15 + 1;
                    bArr3[i15] = (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    j13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e13);
                }
            }
            byte[] bArr4 = this.buffer;
            int i16 = this.position;
            this.position = i16 + 1;
            bArr4[i16] = (byte) j13;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i13, byte[] bArr, int i14, int i15) throws IOException {
            writeTag(i13, 2);
            writeByteArrayNoTag(bArr, i14, i15);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessage(int i13, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i13, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i13, int i14) throws IOException {
            try {
                System.arraycopy(bArr, i13, this.buffer, this.position, i14);
                this.position += i14;
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i14)), e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e13);
            }
        }
    }

    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        ByteOutputEncoder(ByteOutput byteOutput, int i13) {
            super(i13);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i13) throws IOException {
            if (this.limit - this.position < i13) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b13) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i13, boolean z13) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i13, 0);
            buffer(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr) throws IOException {
            writeByteArray(i13, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i13, int i14) throws IOException {
            writeUInt32NoTag(i14);
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i13, ByteBuffer byteBuffer) throws IOException {
            writeTag(i13, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i13, ByteString byteString) throws IOException {
            writeTag(i13, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i13, int i14) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i13, 5);
            bufferFixed32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i13) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i13, long j13) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i13, 1);
            bufferFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j13) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i13, int i14) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i13, 0);
            bufferInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i13) throws IOException {
            if (i13 >= 0) {
                writeUInt32NoTag(i13);
            } else {
                writeUInt64NoTag(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) throws IOException {
            flush();
            this.out.writeLazy(bArr, i13, i14);
            this.totalBytesWritten += i14;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i13, MessageLite messageLite) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i13, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i13, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i13, String str) throws IOException {
            writeTag(i13, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i13 = iComputeUInt32SizeNoTag + length;
            int i14 = this.limit;
            if (i13 > i14) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i13 > i14 - this.position) {
                doFlush();
            }
            int i15 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i16 = i15 + iComputeUInt32SizeNoTag2;
                    this.position = i16;
                    int iEncode2 = Utf8.encode(str, this.buffer, i16, this.limit - i16);
                    this.position = i15;
                    int i17 = (iEncode2 - i15) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i17);
                    this.position = iEncode2;
                    this.totalBytesWritten += i17;
                } else {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e13) {
                this.totalBytesWritten -= this.position - i15;
                this.position = i15;
                inefficientWriteStringNoTag(str, e13);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i13, int i14) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i13, int i14) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i13, 0);
            bufferUInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i13) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i13, long j13) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i13, 0);
            bufferUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j13) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr, int i14, int i15) throws IOException {
            writeTag(i13, 2);
            writeByteArrayNoTag(bArr, i14, i15);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i13, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) throws IOException {
            flush();
            this.out.write(bArr, i13, i14);
            this.totalBytesWritten += i14;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }
    }

    private static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.ArrayEncoder, com.google.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th2) {
            super(MESSAGE, th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i13) {
            super(i13);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i13) throws IOException {
            if (this.limit - this.position < i13) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b13) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i13, boolean z13) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i13, 0);
            buffer(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr) throws IOException {
            writeByteArray(i13, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i13, int i14) throws IOException {
            writeUInt32NoTag(i14);
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i13, ByteBuffer byteBuffer) throws IOException {
            writeTag(i13, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i13, ByteString byteString) throws IOException {
            writeTag(i13, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i13, int i14) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i13, 5);
            bufferFixed32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i13) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i13, long j13) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i13, 1);
            bufferFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j13) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i13, int i14) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i13, 0);
            bufferInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i13) throws IOException {
            if (i13 >= 0) {
                writeUInt32NoTag(i13);
            } else {
                writeUInt64NoTag(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) throws IOException {
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i13, MessageLite messageLite) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i13, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i13, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i13, String str) throws IOException {
            writeTag(i13, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i13 = iComputeUInt32SizeNoTag + length;
                int i14 = this.limit;
                if (i13 > i14) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i13 > i14 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i15 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i16 = i15 + iComputeUInt32SizeNoTag2;
                        this.position = i16;
                        int iEncode2 = Utf8.encode(str, this.buffer, i16, this.limit - i16);
                        this.position = i15;
                        iEncodedLength = (iEncode2 - i15) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e13) {
                    this.totalBytesWritten -= this.position - i15;
                    this.position = i15;
                    throw e13;
                } catch (ArrayIndexOutOfBoundsException e14) {
                    throw new OutOfSpaceException(e14);
                }
            } catch (Utf8.UnpairedSurrogateException e15) {
                inefficientWriteStringNoTag(str, e15);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i13, int i14) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i13, int i14) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i13, 0);
            bufferUInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i13) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i13, long j13) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i13, 0);
            bufferUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j13) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr, int i14, int i15) throws IOException {
            writeTag(i13, 2);
            writeByteArrayNoTag(bArr, i14, i15);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i13, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) throws IOException {
            int i15 = this.limit;
            int i16 = this.position;
            if (i15 - i16 >= i14) {
                System.arraycopy(bArr, i13, this.buffer, i16, i14);
                this.position += i14;
                this.totalBytesWritten += i14;
                return;
            }
            int i17 = i15 - i16;
            System.arraycopy(bArr, i13, this.buffer, i16, i17);
            int i18 = i13 + i17;
            int i19 = i14 - i17;
            this.position = this.limit;
            this.totalBytesWritten += i17;
            doFlush();
            if (i19 <= this.limit) {
                System.arraycopy(bArr, i18, this.buffer, 0, i19);
                this.position = i19;
            } else {
                this.out.write(bArr, i18, i19);
            }
            this.totalBytesWritten += i19;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i13 = this.limit;
            int i14 = this.position;
            if (i13 - i14 >= iRemaining) {
                byteBuffer.get(this.buffer, i14, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i15 = i13 - i14;
            byteBuffer.get(this.buffer, i14, i15);
            int i16 = iRemaining - i15;
            this.position = this.limit;
            this.totalBytesWritten += i15;
            doFlush();
            while (true) {
                int i17 = this.limit;
                if (i16 > i17) {
                    byteBuffer.get(this.buffer, 0, i17);
                    this.out.write(this.buffer, 0, this.limit);
                    int i18 = this.limit;
                    i16 -= i18;
                    this.totalBytesWritten += i18;
                } else {
                    byteBuffer.get(this.buffer, 0, i16);
                    this.position = i16;
                    this.totalBytesWritten += i16;
                    return;
                }
            }
        }
    }

    private static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws IOException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b13) throws IOException {
            try {
                this.buffer.put(b13);
            } catch (BufferOverflowException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i13, boolean z13) throws IOException {
            writeTag(i13, 0);
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr) throws IOException {
            writeByteArray(i13, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i13, int i14) throws IOException {
            writeUInt32NoTag(i14);
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i13, ByteBuffer byteBuffer) throws IOException {
            writeTag(i13, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i13, ByteString byteString) throws IOException {
            writeTag(i13, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i13, int i14) throws IOException {
            writeTag(i13, 5);
            writeFixed32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i13) throws IOException {
            try {
                this.buffer.putInt(i13);
            } catch (BufferOverflowException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i13, long j13) throws IOException {
            writeTag(i13, 1);
            writeFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j13) throws IOException {
            try {
                this.buffer.putLong(j13);
            } catch (BufferOverflowException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i13, int i14) throws IOException {
            writeTag(i13, 0);
            writeInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i13) throws IOException {
            if (i13 >= 0) {
                writeUInt32NoTag(i13);
            } else {
                writeUInt64NoTag(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) throws IOException {
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i13, MessageLite messageLite) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i13, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i13, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i13, String str) throws IOException {
            writeTag(i13, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                    Java8Compatibility.position(this.buffer, iPosition2);
                    encode(str);
                    int iPosition3 = this.buffer.position();
                    Java8Compatibility.position(this.buffer, iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    Java8Compatibility.position(this.buffer, iPosition3);
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                }
            } catch (Utf8.UnpairedSurrogateException e13) {
                Java8Compatibility.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e13);
            } catch (IllegalArgumentException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i13, int i14) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i13, int i14) throws IOException {
            writeTag(i13, 0);
            writeUInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i13) throws IOException {
            while ((i13 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    i13 >>>= 7;
                } catch (BufferOverflowException e13) {
                    throw new OutOfSpaceException(e13);
                }
            }
            this.buffer.put((byte) i13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i13, long j13) throws IOException {
            writeTag(i13, 0);
            writeUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j13) throws IOException {
            while (((-128) & j13) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 >>>= 7;
                } catch (BufferOverflowException e13) {
                    throw new OutOfSpaceException(e13);
                }
            }
            this.buffer.put((byte) j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr, int i14, int i15) throws IOException {
            writeTag(i13, 2);
            writeByteArrayNoTag(bArr, i14, i15);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) throws IOException {
            try {
                this.buffer.put(bArr, i13, i14);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            } catch (BufferOverflowException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i13, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e13) {
                throw new OutOfSpaceException(e13);
            }
        }
    }

    private static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) byteBuffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j13) {
            return (int) (j13 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j13) {
            Java8Compatibility.position(this.buffer, bufferPos(j13));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b13) throws IOException {
            long j13 = this.position;
            if (j13 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j13;
            UnsafeUtil.putByte(j13, b13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i13, boolean z13) throws IOException {
            writeTag(i13, 0);
            write(z13 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr) throws IOException {
            writeByteArray(i13, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i13, int i14) throws IOException {
            writeUInt32NoTag(i14);
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i13, ByteBuffer byteBuffer) throws IOException {
            writeTag(i13, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i13, ByteString byteString) throws IOException {
            writeTag(i13, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i13, int i14) throws IOException {
            writeTag(i13, 5);
            writeFixed32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i13) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i13);
            this.position += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i13, long j13) throws IOException {
            writeTag(i13, 1);
            writeFixed64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j13) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j13);
            this.position += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i13, int i14) throws IOException {
            writeTag(i13, 0);
            writeInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i13) throws IOException {
            if (i13 >= 0) {
                writeUInt32NoTag(i13);
            } else {
                writeUInt64NoTag(i13);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i13, int i14) throws IOException {
            write(bArr, i13, i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i13, MessageLite messageLite) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i13, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i13, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i13);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i13, String str) throws IOException {
            writeTag(i13, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j13 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                    Java8Compatibility.position(this.buffer, iBufferPos);
                    Utf8.encodeUtf8(str, this.buffer);
                    int iPosition = this.buffer.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.position += (long) iPosition;
                } else {
                    int iEncodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += (long) iEncodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e13) {
                this.position = j13;
                repositionBuffer(j13);
                inefficientWriteStringNoTag(str, e13);
            } catch (IllegalArgumentException e14) {
                throw new OutOfSpaceException(e14);
            } catch (IndexOutOfBoundsException e15) {
                throw new OutOfSpaceException(e15);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i13, int i14) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i13, i14));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i13, int i14) throws IOException {
            writeTag(i13, 0);
            writeUInt32NoTag(i14);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i13) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i13 & (-128)) != 0) {
                    long j13 = this.position;
                    this.position = j13 + 1;
                    UnsafeUtil.putByte(j13, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    i13 >>>= 7;
                }
                long j14 = this.position;
                this.position = 1 + j14;
                UnsafeUtil.putByte(j14, (byte) i13);
                return;
            }
            while (true) {
                long j15 = this.position;
                if (j15 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i13 & (-128)) == 0) {
                    this.position = 1 + j15;
                    UnsafeUtil.putByte(j15, (byte) i13);
                    return;
                } else {
                    this.position = j15 + 1;
                    UnsafeUtil.putByte(j15, (byte) ((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    i13 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i13, long j13) throws IOException {
            writeTag(i13, 0);
            writeUInt64NoTag(j13);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j13) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j13 & (-128)) != 0) {
                    long j14 = this.position;
                    this.position = j14 + 1;
                    UnsafeUtil.putByte(j14, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 >>>= 7;
                }
                long j15 = this.position;
                this.position = 1 + j15;
                UnsafeUtil.putByte(j15, (byte) j13);
                return;
            }
            while (true) {
                long j16 = this.position;
                if (j16 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j13 & (-128)) == 0) {
                    this.position = 1 + j16;
                    UnsafeUtil.putByte(j16, (byte) j13);
                    return;
                } else {
                    this.position = j16 + 1;
                    UnsafeUtil.putByte(j16, (byte) ((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i13, byte[] bArr, int i14, int i15) throws IOException {
            writeTag(i13, 2);
            writeByteArrayNoTag(bArr, i14, i15);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i13, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i13, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i13, int i14) throws IOException {
            if (bArr != null && i13 >= 0 && i14 >= 0 && bArr.length - i14 >= i13) {
                long j13 = i14;
                long j14 = this.limit - j13;
                long j15 = this.position;
                if (j14 >= j15) {
                    UnsafeUtil.copyMemory(bArr, i13, j15, j13);
                    this.position += j13;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i14)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) iRemaining;
            } catch (BufferOverflowException e13) {
                throw new OutOfSpaceException(e13);
            }
        }
    }

    public static int computeBoolSize(int i13, boolean z13) {
        return computeTagSize(i13) + computeBoolSizeNoTag(z13);
    }

    public static int computeBoolSizeNoTag(boolean z13) {
        return 1;
    }

    public static int computeByteArraySize(int i13, byte[] bArr) {
        return computeTagSize(i13) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i13, ByteBuffer byteBuffer) {
        return computeTagSize(i13) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i13, ByteString byteString) {
        return computeTagSize(i13) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i13, double d13) {
        return computeTagSize(i13) + computeDoubleSizeNoTag(d13);
    }

    public static int computeDoubleSizeNoTag(double d13) {
        return 8;
    }

    public static int computeEnumSize(int i13, int i14) {
        return computeTagSize(i13) + computeEnumSizeNoTag(i14);
    }

    public static int computeEnumSizeNoTag(int i13) {
        return computeInt32SizeNoTag(i13);
    }

    public static int computeFixed32Size(int i13, int i14) {
        return computeTagSize(i13) + computeFixed32SizeNoTag(i14);
    }

    public static int computeFixed32SizeNoTag(int i13) {
        return 4;
    }

    public static int computeFixed64Size(int i13, long j13) {
        return computeTagSize(i13) + computeFixed64SizeNoTag(j13);
    }

    public static int computeFixed64SizeNoTag(long j13) {
        return 8;
    }

    public static int computeFloatSize(int i13, float f13) {
        return computeTagSize(i13) + computeFloatSizeNoTag(f13);
    }

    public static int computeFloatSizeNoTag(float f13) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i13, MessageLite messageLite) {
        return (computeTagSize(i13) * 2) + messageLite.getSerializedSize();
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i13, int i14) {
        return computeTagSize(i13) + computeInt32SizeNoTag(i14);
    }

    public static int computeInt32SizeNoTag(int i13) {
        if (i13 >= 0) {
            return computeUInt32SizeNoTag(i13);
        }
        return 10;
    }

    public static int computeInt64Size(int i13, long j13) {
        return computeTagSize(i13) + computeInt64SizeNoTag(j13);
    }

    public static int computeInt64SizeNoTag(long j13) {
        return computeUInt64SizeNoTag(j13);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i13, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i13) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i13, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i13) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    static int computeLengthDelimitedFieldSize(int i13) {
        return computeUInt32SizeNoTag(i13) + i13;
    }

    public static int computeMessageSetExtensionSize(int i13, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i13) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i13, MessageLite messageLite) {
        return computeTagSize(i13) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computePreferredBufferSize(int i13) {
        if (i13 > 4096) {
            return 4096;
        }
        return i13;
    }

    public static int computeRawMessageSetExtensionSize(int i13, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i13) + computeBytesSize(3, byteString);
    }

    @InlineMe(imports = {"com.google.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(int i13) {
        return computeUInt32SizeNoTag(i13);
    }

    @InlineMe(imports = {"com.google.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long j13) {
        return computeUInt64SizeNoTag(j13);
    }

    public static int computeSFixed32Size(int i13, int i14) {
        return computeTagSize(i13) + computeSFixed32SizeNoTag(i14);
    }

    public static int computeSFixed32SizeNoTag(int i13) {
        return 4;
    }

    public static int computeSFixed64Size(int i13, long j13) {
        return computeTagSize(i13) + computeSFixed64SizeNoTag(j13);
    }

    public static int computeSFixed64SizeNoTag(long j13) {
        return 8;
    }

    public static int computeSInt32Size(int i13, int i14) {
        return computeTagSize(i13) + computeSInt32SizeNoTag(i14);
    }

    public static int computeSInt32SizeNoTag(int i13) {
        return computeUInt32SizeNoTag(encodeZigZag32(i13));
    }

    public static int computeSInt64Size(int i13, long j13) {
        return computeTagSize(i13) + computeSInt64SizeNoTag(j13);
    }

    public static int computeSInt64SizeNoTag(long j13) {
        return computeUInt64SizeNoTag(encodeZigZag64(j13));
    }

    public static int computeStringSize(int i13, String str) {
        return computeTagSize(i13) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i13) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i13, 0));
    }

    public static int computeUInt32Size(int i13, int i14) {
        return computeTagSize(i13) + computeUInt32SizeNoTag(i14);
    }

    public static int computeUInt32SizeNoTag(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i13, long j13) {
        return computeTagSize(i13) + computeUInt64SizeNoTag(j13);
    }

    public static int computeUInt64SizeNoTag(long j13) {
        int i13;
        if (((-128) & j13) == 0) {
            return 1;
        }
        if (j13 < 0) {
            return 10;
        }
        if (((-34359738368L) & j13) != 0) {
            j13 >>>= 28;
            i13 = 6;
        } else {
            i13 = 2;
        }
        if (((-2097152) & j13) != 0) {
            i13 += 2;
            j13 >>>= 14;
        }
        return (j13 & (-16384)) != 0 ? i13 + 1 : i13;
    }

    public static int encodeZigZag32(int i13) {
        return (i13 >> 31) ^ (i13 << 1);
    }

    public static long encodeZigZag64(long j13) {
        return (j13 >> 63) ^ (j13 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e13) {
            throw new OutOfSpaceException(e13);
        }
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b13) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i13, int i14) throws IOException;

    public abstract void writeBool(int i13, boolean z13) throws IOException;

    public final void writeBoolNoTag(boolean z13) throws IOException {
        write(z13 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i13, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i13, byte[] bArr, int i14, int i15) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i13, int i14) throws IOException;

    public abstract void writeByteBuffer(int i13, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i13, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i13, double d13) throws IOException {
        writeFixed64(i13, Double.doubleToRawLongBits(d13));
    }

    public final void writeDoubleNoTag(double d13) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d13));
    }

    public final void writeEnum(int i13, int i14) throws IOException {
        writeInt32(i13, i14);
    }

    public final void writeEnumNoTag(int i13) throws IOException {
        writeInt32NoTag(i13);
    }

    public abstract void writeFixed32(int i13, int i14) throws IOException;

    public abstract void writeFixed32NoTag(int i13) throws IOException;

    public abstract void writeFixed64(int i13, long j13) throws IOException;

    public abstract void writeFixed64NoTag(long j13) throws IOException;

    public final void writeFloat(int i13, float f13) throws IOException {
        writeFixed32(i13, Float.floatToRawIntBits(f13));
    }

    public final void writeFloatNoTag(float f13) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f13));
    }

    @Deprecated
    public final void writeGroup(int i13, MessageLite messageLite) throws IOException {
        writeTag(i13, 3);
        writeGroupNoTag(messageLite);
        writeTag(i13, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i13, int i14) throws IOException;

    public abstract void writeInt32NoTag(int i13) throws IOException;

    public final void writeInt64(int i13, long j13) throws IOException {
        writeUInt64(i13, j13);
    }

    public final void writeInt64NoTag(long j13) throws IOException {
        writeUInt64NoTag(j13);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i13, int i14) throws IOException;

    public abstract void writeMessage(int i13, MessageLite messageLite) throws IOException;

    abstract void writeMessage(int i13, MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    abstract void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageSetExtension(int i13, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b13) throws IOException {
        write(b13);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(int i13) throws IOException {
        writeFixed32NoTag(i13);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(long j13) throws IOException {
        writeFixed64NoTag(j13);
    }

    public abstract void writeRawMessageSetExtension(int i13, ByteString byteString) throws IOException;

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int i13) throws IOException {
        writeUInt32NoTag(i13);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long j13) throws IOException {
        writeUInt64NoTag(j13);
    }

    public final void writeSFixed32(int i13, int i14) throws IOException {
        writeFixed32(i13, i14);
    }

    public final void writeSFixed32NoTag(int i13) throws IOException {
        writeFixed32NoTag(i13);
    }

    public final void writeSFixed64(int i13, long j13) throws IOException {
        writeFixed64(i13, j13);
    }

    public final void writeSFixed64NoTag(long j13) throws IOException {
        writeFixed64NoTag(j13);
    }

    public final void writeSInt32(int i13, int i14) throws IOException {
        writeUInt32(i13, encodeZigZag32(i14));
    }

    public final void writeSInt32NoTag(int i13) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i13));
    }

    public final void writeSInt64(int i13, long j13) throws IOException {
        writeUInt64(i13, encodeZigZag64(j13));
    }

    public final void writeSInt64NoTag(long j13) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j13));
    }

    public abstract void writeString(int i13, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i13, int i14) throws IOException;

    public abstract void writeUInt32(int i13, int i14) throws IOException;

    public abstract void writeUInt32NoTag(int i13) throws IOException;

    public abstract void writeUInt64(int i13, long j13) throws IOException;

    public abstract void writeUInt64NoTag(long j13) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    static int computeGroupSize(int i13, MessageLite messageLite, Schema schema) {
        return (computeTagSize(i13) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @Deprecated
    static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    static int computeMessageSize(int i13, MessageLite messageLite, Schema schema) {
        return computeTagSize(i13) + computeMessageSizeNoTag(messageLite, schema);
    }

    static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i13) {
        return new OutputStreamEncoder(outputStream, i13);
    }

    @Deprecated
    final void writeGroupNoTag(MessageLite messageLite, Schema schema) throws IOException {
        schema.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i13) throws IOException {
        write((byte) i13);
    }

    public final void writeRawBytes(byte[] bArr, int i13, int i14) throws IOException {
        write(bArr, i13, i14);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i13, int i14) {
        return new ArrayEncoder(bArr, i13, i14);
    }

    @Deprecated
    final void writeGroup(int i13, MessageLite messageLite, Schema schema) throws IOException {
        writeTag(i13, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i13, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i13) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i13) {
        if (i13 >= 0) {
            return new ByteOutputEncoder(byteOutput, i13);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
