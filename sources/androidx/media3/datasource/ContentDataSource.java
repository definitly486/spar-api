package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import b3.lqeggnwhkg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends b3.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f9854btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f9855dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ContentResolver f9856eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Uri f9857gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private AssetFileDescriptor f9858lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private FileInputStream f9859nufgyqmvbu;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i13) {
            super(iOException, i13);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f9856eablkybsjg = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f9857gxszxtbevo;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.iobyxmoadg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f9857gxszxtbevo = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f9859nufgyqmvbu     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f9859nufgyqmvbu = r0
            android.content.res.AssetFileDescriptor r3 = r5.f9858lqeggnwhkg     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f9858lqeggnwhkg = r0
            boolean r0 = r5.f9854btonecajqb
            if (r0 == 0) goto L2b
            r5.f9854btonecajqb = r2
            r5.vdvldrhtss()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f9858lqeggnwhkg = r0
            boolean r0 = r5.f9854btonecajqb
            if (r0 == 0) goto L3d
            r5.f9854btonecajqb = r2
            r5.vdvldrhtss()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f9859nufgyqmvbu = r0
            android.content.res.AssetFileDescriptor r4 = r5.f9858lqeggnwhkg     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f9858lqeggnwhkg = r0
            boolean r0 = r5.f9854btonecajqb
            if (r0 == 0) goto L5d
            r5.f9854btonecajqb = r2
            r5.vdvldrhtss()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f9858lqeggnwhkg = r0
            boolean r0 = r5.f9854btonecajqb
            if (r0 == 0) goto L6f
            r5.f9854btonecajqb = r2
            r5.vdvldrhtss()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.ContentDataSource.close():void");
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = lqeggnwhkgVar.f15057iobyxmoadg.normalizeScheme();
            this.f9857gxszxtbevo = uriNormalizeScheme;
            oxmwwwfdhm(lqeggnwhkgVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f9856eablkybsjg.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f9856eablkybsjg.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f9858lqeggnwhkg = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f9859nufgyqmvbu = fileInputStream;
            if (length != -1 && lqeggnwhkgVar.f15058lqeggnwhkg > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(lqeggnwhkgVar.f15058lqeggnwhkg + startOffset) - startOffset;
            if (jSkip != lqeggnwhkgVar.f15058lqeggnwhkg) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f9855dxjokdxxww = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f9855dxjokdxxww = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j13 = length - jSkip;
                this.f9855dxjokdxxww = j13;
                if (j13 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = lqeggnwhkgVar.f15059nufgyqmvbu;
            if (jMin != -1) {
                long j14 = this.f9855dxjokdxxww;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.f9855dxjokdxxww = jMin;
            }
            this.f9854btonecajqb = true;
            kcexrzcfyt(lqeggnwhkgVar);
            long j15 = lqeggnwhkgVar.f15059nufgyqmvbu;
            return j15 != -1 ? j15 : this.f9855dxjokdxxww;
        } catch (ContentDataSourceException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new ContentDataSourceException(e14, e14 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws ContentDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j13 = this.f9855dxjokdxxww;
        if (j13 == 0) {
            return -1;
        }
        if (j13 != -1) {
            try {
                i14 = (int) Math.min(j13, i14);
            } catch (IOException e13) {
                throw new ContentDataSourceException(e13, 2000);
            }
        }
        int i15 = ((FileInputStream) stevsuqkhv.nufgyqmvbu(this.f9859nufgyqmvbu)).read(bArr, i13, i14);
        if (i15 == -1) {
            return -1;
        }
        long j14 = this.f9855dxjokdxxww;
        if (j14 != -1) {
            this.f9855dxjokdxxww = j14 - ((long) i15);
        }
        rgvfuqvkyq(i15);
        return i15;
    }
}
