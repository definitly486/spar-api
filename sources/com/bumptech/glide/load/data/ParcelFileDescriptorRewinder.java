package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final InternalRewinder f20771iobyxmoadg;

    private static final class InternalRewinder {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ParcelFileDescriptor f20772iobyxmoadg;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f20772iobyxmoadg = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f20772iobyxmoadg.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f20772iobyxmoadg;
            } catch (ErrnoException e13) {
                throw new IOException(e13);
            }
        }
    }

    public static final class iobyxmoadg implements eablkybsjg.iobyxmoadg {
        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        public Class iobyxmoadg() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public eablkybsjg zoijcleaow(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f20771iobyxmoadg = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean ppxfxbqfkf() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.eablkybsjg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor iobyxmoadg() {
        return this.f20771iobyxmoadg.rewind();
    }

    @Override // com.bumptech.glide.load.data.eablkybsjg
    public void zoijcleaow() {
    }
}
