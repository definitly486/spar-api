package z6;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import x6.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Uri f129181iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129182zoijcleaow;

    public static final class iobyxmoadg implements dxjokdxxww.iobyxmoadg {
        private final boolean ppxfxbqfkf(Uri uri) {
            return zdlpuopuiu.eablkybsjg(uri.getScheme(), "content");
        }

        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(Uri uri, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            if (ppxfxbqfkf(uri)) {
                return new eablkybsjg(uri, draadjrbmkVar);
            }
            return null;
        }
    }

    public eablkybsjg(Uri uri, e7.draadjrbmk draadjrbmkVar) {
        this.f129181iobyxmoadg = uri;
        this.f129182zoijcleaow = draadjrbmkVar;
    }

    private final Bundle wkgbmnqykc() {
        f7.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = this.f129182zoijcleaow.ojitshcjhn().wkgbmnqykc();
        f7.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = ppxfxbqfkfVarWkgbmnqykc instanceof f7.ppxfxbqfkf.iobyxmoadg ? (f7.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVarWkgbmnqykc : null;
        if (iobyxmoadgVar == null) {
            return null;
        }
        int i13 = iobyxmoadgVar.f33044iobyxmoadg;
        f7.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = this.f129182zoijcleaow.ojitshcjhn().ppxfxbqfkf();
        f7.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkfVarPpxfxbqfkf instanceof f7.ppxfxbqfkf.iobyxmoadg ? (f7.ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVarPpxfxbqfkf : null;
        if (iobyxmoadgVar2 == null) {
            return null;
        }
        int i14 = iobyxmoadgVar2.f33044iobyxmoadg;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i13, i14));
        return bundle;
    }

    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.f129182zoijcleaow.lqeggnwhkg().getContentResolver();
        if (zoijcleaow(this.f129181iobyxmoadg)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f129181iobyxmoadg, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f129181iobyxmoadg + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !ppxfxbqfkf(this.f129181iobyxmoadg)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.f129181iobyxmoadg);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f129181iobyxmoadg + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.f129181iobyxmoadg, "image/*", wkgbmnqykc(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f129181iobyxmoadg + "'.").toString());
            }
        }
        return new wflxmlrfwp(ojitshcjhn.zoijcleaow(bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.btonecajqb(inputStreamOpenInputStream)), this.f129182zoijcleaow.lqeggnwhkg(), new x6.ppxfxbqfkf(this.f129181iobyxmoadg)), contentResolver.getType(this.f129181iobyxmoadg), x6.wkgbmnqykc.DISK);
    }

    public final boolean ppxfxbqfkf(Uri uri) {
        List<String> pathSegments;
        int size;
        return zdlpuopuiu.eablkybsjg(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && zdlpuopuiu.eablkybsjg(pathSegments.get(size + (-3)), "audio") && zdlpuopuiu.eablkybsjg(pathSegments.get(size + (-2)), "albums");
    }

    public final boolean zoijcleaow(Uri uri) {
        return zdlpuopuiu.eablkybsjg(uri.getAuthority(), "com.android.contacts") && zdlpuopuiu.eablkybsjg(uri.getLastPathSegment(), "display_photo");
    }
}
