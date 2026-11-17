package h3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class ylkuphrtab {
    public static ByteBuffer iobyxmoadg(ByteBuffer byteBuffer, int i13, int i14, int i15, int i16) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i15 < i16) {
            ppxfxbqfkf(byteBufferOrder, (int) ((((long) zoijcleaow(byteBuffer, i13)) * ((long) i15)) / ((long) i16)), i13);
            if (byteBuffer.position() == iPosition + i14) {
                i15++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }

    public static void ppxfxbqfkf(ByteBuffer byteBuffer, int i13, int i14) {
        if (i14 == 2) {
            byteBuffer.put((byte) (i13 >> 16));
            byteBuffer.put((byte) (i13 >> 24));
            return;
        }
        if (i14 == 3) {
            byteBuffer.put((byte) (i13 >> 24));
            return;
        }
        if (i14 == 4) {
            if (i13 < 0) {
                byteBuffer.putFloat((-i13) / (-2.14748365E9f));
                return;
            } else {
                byteBuffer.putFloat(i13 / 2.14748365E9f);
                return;
            }
        }
        if (i14 == 21) {
            byteBuffer.put((byte) (i13 >> 8));
            byteBuffer.put((byte) (i13 >> 16));
            byteBuffer.put((byte) (i13 >> 24));
            return;
        }
        if (i14 == 22) {
            byteBuffer.put((byte) i13);
            byteBuffer.put((byte) (i13 >> 8));
            byteBuffer.put((byte) (i13 >> 16));
            byteBuffer.put((byte) (i13 >> 24));
            return;
        }
        if (i14 == 268435456) {
            byteBuffer.put((byte) (i13 >> 24));
            byteBuffer.put((byte) (i13 >> 16));
            return;
        }
        if (i14 == 1342177280) {
            byteBuffer.put((byte) (i13 >> 24));
            byteBuffer.put((byte) (i13 >> 16));
            byteBuffer.put((byte) (i13 >> 8));
        } else {
            if (i14 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBuffer.put((byte) (i13 >> 24));
            byteBuffer.put((byte) (i13 >> 16));
            byteBuffer.put((byte) (i13 >> 8));
            byteBuffer.put((byte) i13);
        }
    }

    public static int zoijcleaow(ByteBuffer byteBuffer, int i13) {
        if (i13 == 2) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i13 == 3) {
            return (byteBuffer.get() & 255) << 24;
        }
        if (i13 == 4) {
            float fAgtfadlqog = stevsuqkhv.agtfadlqog(byteBuffer.getFloat(), -1.0f, 1.0f);
            return fAgtfadlqog < 0.0f ? (int) ((-fAgtfadlqog) * (-2.14748365E9f)) : (int) (fAgtfadlqog * 2.14748365E9f);
        }
        if (i13 == 21) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i13 == 22) {
            return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i13 == 268435456) {
            return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
        }
        if (i13 == 1342177280) {
            return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i13 == 1610612736) {
            return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
        }
        throw new IllegalStateException();
    }
}
