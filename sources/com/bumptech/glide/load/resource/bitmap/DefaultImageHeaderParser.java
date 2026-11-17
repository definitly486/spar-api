package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final byte[] f21039iobyxmoadg = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f21040zoijcleaow = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int iobyxmoadg();

        short ppxfxbqfkf();

        long wflxmlrfwp(long j13);

        int zoijcleaow(byte[] bArr, int i13);
    }

    private static final class iobyxmoadg implements Reader {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ByteBuffer f21041iobyxmoadg;

        iobyxmoadg(ByteBuffer byteBuffer) {
            this.f21041iobyxmoadg = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int iobyxmoadg() {
            return (ppxfxbqfkf() << 8) | ppxfxbqfkf();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short ppxfxbqfkf() throws Reader.EndOfFileException {
            if (this.f21041iobyxmoadg.remaining() >= 1) {
                return (short) (this.f21041iobyxmoadg.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long wflxmlrfwp(long j13) {
            int iMin = (int) Math.min(this.f21041iobyxmoadg.remaining(), j13);
            ByteBuffer byteBuffer = this.f21041iobyxmoadg;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int zoijcleaow(byte[] bArr, int i13) {
            int iMin = Math.min(i13, this.f21041iobyxmoadg.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f21041iobyxmoadg.get(bArr, 0, iMin);
            return iMin;
        }
    }

    private static final class ppxfxbqfkf implements Reader {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final InputStream f21042iobyxmoadg;

        ppxfxbqfkf(InputStream inputStream) {
            this.f21042iobyxmoadg = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int iobyxmoadg() {
            return (ppxfxbqfkf() << 8) | ppxfxbqfkf();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short ppxfxbqfkf() throws IOException {
            int i13 = this.f21042iobyxmoadg.read();
            if (i13 != -1) {
                return (short) i13;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long wflxmlrfwp(long j13) throws IOException {
            if (j13 < 0) {
                return 0L;
            }
            long j14 = j13;
            while (j14 > 0) {
                long jSkip = this.f21042iobyxmoadg.skip(j14);
                if (jSkip <= 0) {
                    if (this.f21042iobyxmoadg.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j14 -= jSkip;
            }
            return j13 - j14;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int zoijcleaow(byte[] bArr, int i13) throws Reader.EndOfFileException {
            int i14 = 0;
            int i15 = 0;
            while (i14 < i13 && (i15 = this.f21042iobyxmoadg.read(bArr, i14, i13 - i14)) != -1) {
                i14 += i15;
            }
            if (i14 == 0 && i15 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i14;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ByteBuffer f21043iobyxmoadg;

        zoijcleaow(byte[] bArr, int i13) {
            this.f21043iobyxmoadg = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i13);
        }

        private boolean ppxfxbqfkf(int i13, int i14) {
            return this.f21043iobyxmoadg.remaining() - i13 >= i14;
        }

        void eablkybsjg(ByteOrder byteOrder) {
            this.f21043iobyxmoadg.order(byteOrder);
        }

        short iobyxmoadg(int i13) {
            if (ppxfxbqfkf(i13, 2)) {
                return this.f21043iobyxmoadg.getShort(i13);
            }
            return (short) -1;
        }

        int wkgbmnqykc() {
            return this.f21043iobyxmoadg.remaining();
        }

        int zoijcleaow(int i13) {
            if (ppxfxbqfkf(i13, 4)) {
                return this.f21043iobyxmoadg.getInt(i13);
            }
            return -1;
        }
    }

    private int btonecajqb(Reader reader) {
        short sPpxfxbqfkf;
        int iIobyxmoadg;
        long j13;
        long jWflxmlrfwp;
        do {
            short sPpxfxbqfkf2 = reader.ppxfxbqfkf();
            if (sPpxfxbqfkf2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sPpxfxbqfkf2));
                }
                return -1;
            }
            sPpxfxbqfkf = reader.ppxfxbqfkf();
            if (sPpxfxbqfkf == 218) {
                return -1;
            }
            if (sPpxfxbqfkf == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iIobyxmoadg = reader.iobyxmoadg() - 2;
            if (sPpxfxbqfkf == 225) {
                return iIobyxmoadg;
            }
            j13 = iIobyxmoadg;
            jWflxmlrfwp = reader.wflxmlrfwp(j13);
        } while (jWflxmlrfwp == j13);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sPpxfxbqfkf) + ", wanted to skip: " + iIobyxmoadg + ", but actually skipped: " + jWflxmlrfwp);
        }
        return -1;
    }

    private int draadjrbmk(Reader reader, byte[] bArr, int i13) {
        int iZoijcleaow = reader.zoijcleaow(bArr, i13);
        if (iZoijcleaow == i13) {
            if (dxjokdxxww(bArr, i13)) {
                return gtknphoqwx(new zoijcleaow(bArr, i13));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i13 + ", actually read: " + iZoijcleaow);
        }
        return -1;
    }

    private boolean dxjokdxxww(byte[] bArr, int i13) {
        boolean z13 = bArr != null && i13 > f21039iobyxmoadg.length;
        if (z13) {
            int i14 = 0;
            while (true) {
                byte[] bArr2 = f21039iobyxmoadg;
                if (i14 >= bArr2.length) {
                    break;
                }
                if (bArr[i14] != bArr2[i14]) {
                    return false;
                }
                i14++;
            }
        }
        return z13;
    }

    private static int eablkybsjg(int i13, int i14) {
        return i13 + 2 + (i14 * 12);
    }

    private static int gtknphoqwx(zoijcleaow zoijcleaowVar) {
        ByteOrder byteOrder;
        short sIobyxmoadg = zoijcleaowVar.iobyxmoadg(6);
        if (sIobyxmoadg != 18761) {
            if (sIobyxmoadg != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sIobyxmoadg));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        zoijcleaowVar.eablkybsjg(byteOrder);
        int iZoijcleaow = zoijcleaowVar.zoijcleaow(10) + 6;
        short sIobyxmoadg2 = zoijcleaowVar.iobyxmoadg(iZoijcleaow);
        for (int i13 = 0; i13 < sIobyxmoadg2; i13++) {
            int iEablkybsjg = eablkybsjg(iZoijcleaow, i13);
            short sIobyxmoadg3 = zoijcleaowVar.iobyxmoadg(iEablkybsjg);
            if (sIobyxmoadg3 == 274) {
                short sIobyxmoadg4 = zoijcleaowVar.iobyxmoadg(iEablkybsjg + 2);
                if (sIobyxmoadg4 >= 1 && sIobyxmoadg4 <= 12) {
                    int iZoijcleaow2 = zoijcleaowVar.zoijcleaow(iEablkybsjg + 4);
                    if (iZoijcleaow2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i13 + " tagType=" + ((int) sIobyxmoadg3) + " formatCode=" + ((int) sIobyxmoadg4) + " componentCount=" + iZoijcleaow2);
                        }
                        int i14 = iZoijcleaow2 + f21040zoijcleaow[sIobyxmoadg4];
                        if (i14 <= 4) {
                            int i15 = iEablkybsjg + 8;
                            if (i15 >= 0 && i15 <= zoijcleaowVar.wkgbmnqykc()) {
                                if (i14 >= 0 && i14 + i15 <= zoijcleaowVar.wkgbmnqykc()) {
                                    return zoijcleaowVar.iobyxmoadg(i15);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sIobyxmoadg3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i15 + " tagType=" + ((int) sIobyxmoadg3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sIobyxmoadg4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sIobyxmoadg4));
                }
            }
        }
        return -1;
    }

    private int gxszxtbevo(Reader reader, o8.zoijcleaow zoijcleaowVar) {
        try {
            int iIobyxmoadg = reader.iobyxmoadg();
            if (!nufgyqmvbu(iIobyxmoadg)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iIobyxmoadg);
                }
                return -1;
            }
            int iBtonecajqb = btonecajqb(reader);
            if (iBtonecajqb == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) zoijcleaowVar.ppxfxbqfkf(iBtonecajqb, byte[].class);
            try {
                return draadjrbmk(reader, bArr, iBtonecajqb);
            } finally {
                zoijcleaowVar.eablkybsjg(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType lqeggnwhkg(Reader reader) {
        try {
            int iIobyxmoadg = reader.iobyxmoadg();
            if (iIobyxmoadg == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iPpxfxbqfkf = (iIobyxmoadg << 8) | reader.ppxfxbqfkf();
            if (iPpxfxbqfkf == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iPpxfxbqfkf2 = (iPpxfxbqfkf << 8) | reader.ppxfxbqfkf();
            if (iPpxfxbqfkf2 == -1991225785) {
                reader.wflxmlrfwp(21L);
                try {
                    return reader.ppxfxbqfkf() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iPpxfxbqfkf2 != 1380533830) {
                return wflxmlrfwp(reader, iPpxfxbqfkf2);
            }
            reader.wflxmlrfwp(4L);
            if (((reader.iobyxmoadg() << 16) | reader.iobyxmoadg()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iIobyxmoadg2 = (reader.iobyxmoadg() << 16) | reader.iobyxmoadg();
            if ((iIobyxmoadg2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i13 = iIobyxmoadg2 & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i13 != 88) {
                if (i13 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.wflxmlrfwp(4L);
                return (reader.ppxfxbqfkf() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            reader.wflxmlrfwp(4L);
            short sPpxfxbqfkf = reader.ppxfxbqfkf();
            if ((sPpxfxbqfkf & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (sPpxfxbqfkf & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean nufgyqmvbu(int i13) {
        return (i13 & 65496) == 65496 || i13 == 19789 || i13 == 18761;
    }

    private ImageHeaderParser.ImageType wflxmlrfwp(Reader reader, int i13) {
        if (((reader.iobyxmoadg() << 16) | reader.iobyxmoadg()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iIobyxmoadg = (reader.iobyxmoadg() << 16) | reader.iobyxmoadg();
        if (iIobyxmoadg == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i14 = 0;
        boolean z13 = iIobyxmoadg == 1635150182;
        reader.wflxmlrfwp(4L);
        int i15 = i13 - 16;
        if (i15 % 4 == 0) {
            while (i14 < 5 && i15 > 0) {
                int iIobyxmoadg2 = (reader.iobyxmoadg() << 16) | reader.iobyxmoadg();
                if (iIobyxmoadg2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iIobyxmoadg2 == 1635150182) {
                    z13 = true;
                }
                i14++;
                i15 -= 4;
            }
        }
        return z13 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int iobyxmoadg(ByteBuffer byteBuffer, o8.zoijcleaow zoijcleaowVar) {
        return gxszxtbevo(new iobyxmoadg((ByteBuffer) g9.gtknphoqwx.eablkybsjg(byteBuffer)), (o8.zoijcleaow) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType ppxfxbqfkf(InputStream inputStream) {
        return lqeggnwhkg(new ppxfxbqfkf((InputStream) g9.gtknphoqwx.eablkybsjg(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int wkgbmnqykc(InputStream inputStream, o8.zoijcleaow zoijcleaowVar) {
        return gxszxtbevo(new ppxfxbqfkf((InputStream) g9.gtknphoqwx.eablkybsjg(inputStream)), (o8.zoijcleaow) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType zoijcleaow(ByteBuffer byteBuffer) {
        return lqeggnwhkg(new iobyxmoadg((ByteBuffer) g9.gtknphoqwx.eablkybsjg(byteBuffer)));
    }
}
