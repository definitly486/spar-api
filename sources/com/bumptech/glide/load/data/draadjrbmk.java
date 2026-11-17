package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk implements wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object f20781jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ContentResolver f20782yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Uri f20783zdlpuopuiu;

    public draadjrbmk(ContentResolver contentResolver, Uri uri) {
        this.f20782yggfygwlhe = contentResolver;
        this.f20783zdlpuopuiu = uri;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public final void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        try {
            Object objGxszxtbevo = gxszxtbevo(this.f20783zdlpuopuiu, this.f20782yggfygwlhe);
            this.f20781jyumaefscl = objGxszxtbevo;
            iobyxmoadgVar.gxszxtbevo(objGxszxtbevo);
        } catch (FileNotFoundException e13) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e13);
            }
            iobyxmoadgVar.ppxfxbqfkf(e13);
        }
    }

    protected abstract Object gxszxtbevo(Uri uri, ContentResolver contentResolver);

    protected abstract void ppxfxbqfkf(Object obj);

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public l8.iobyxmoadg wkgbmnqykc() {
        return l8.iobyxmoadg.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void zoijcleaow() {
        Object obj = this.f20781jyumaefscl;
        if (obj != null) {
            try {
                ppxfxbqfkf(obj);
            } catch (IOException unused) {
            }
        }
    }
}
