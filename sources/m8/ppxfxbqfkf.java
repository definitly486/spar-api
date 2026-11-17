package m8;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.btonecajqb;
import com.bumptech.glide.load.data.lqeggnwhkg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements com.bumptech.glide.load.data.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private InputStream f66471jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final eablkybsjg f66472yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Uri f66473zdlpuopuiu;

    static class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final String[] f66474zoijcleaow = {"_data"};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentResolver f66475iobyxmoadg;

        iobyxmoadg(ContentResolver contentResolver) {
            this.f66475iobyxmoadg = contentResolver;
        }

        @Override // m8.wkgbmnqykc
        public Cursor iobyxmoadg(Uri uri) {
            return this.f66475iobyxmoadg.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f66474zoijcleaow, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final String[] f66476zoijcleaow = {"_data"};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ContentResolver f66477iobyxmoadg;

        zoijcleaow(ContentResolver contentResolver) {
            this.f66477iobyxmoadg = contentResolver;
        }

        @Override // m8.wkgbmnqykc
        public Cursor iobyxmoadg(Uri uri) {
            return this.f66477iobyxmoadg.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f66476zoijcleaow, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    ppxfxbqfkf(Uri uri, eablkybsjg eablkybsjgVar) {
        this.f66473zdlpuopuiu = uri;
        this.f66472yggfygwlhe = eablkybsjgVar;
    }

    public static ppxfxbqfkf gxszxtbevo(Context context, Uri uri) {
        return ppxfxbqfkf(context, uri, new iobyxmoadg(context.getContentResolver()));
    }

    public static ppxfxbqfkf lqeggnwhkg(Context context, Uri uri) {
        return ppxfxbqfkf(context, uri, new zoijcleaow(context.getContentResolver()));
    }

    private InputStream nufgyqmvbu() throws Throwable {
        InputStream inputStreamWkgbmnqykc = this.f66472yggfygwlhe.wkgbmnqykc(this.f66473zdlpuopuiu);
        int iIobyxmoadg = inputStreamWkgbmnqykc != null ? this.f66472yggfygwlhe.iobyxmoadg(this.f66473zdlpuopuiu) : -1;
        return iIobyxmoadg != -1 ? new lqeggnwhkg(inputStreamWkgbmnqykc, iIobyxmoadg) : inputStreamWkgbmnqykc;
    }

    private static ppxfxbqfkf ppxfxbqfkf(Context context, Uri uri, wkgbmnqykc wkgbmnqykcVar) {
        return new ppxfxbqfkf(uri, new eablkybsjg(com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context).btonecajqb().lqeggnwhkg(), wkgbmnqykcVar, com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context).eablkybsjg(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void eablkybsjg(btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) throws Throwable {
        try {
            InputStream inputStreamNufgyqmvbu = nufgyqmvbu();
            this.f66471jyumaefscl = inputStreamNufgyqmvbu;
            iobyxmoadgVar.gxszxtbevo(inputStreamNufgyqmvbu);
        } catch (FileNotFoundException e13) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e13);
            }
            iobyxmoadgVar.ppxfxbqfkf(e13);
        }
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public Class iobyxmoadg() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public l8.iobyxmoadg wkgbmnqykc() {
        return l8.iobyxmoadg.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void zoijcleaow() {
        InputStream inputStream = this.f66471jyumaefscl;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
