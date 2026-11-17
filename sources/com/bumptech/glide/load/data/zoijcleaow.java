package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow implements wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object f20798jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AssetManager f20799yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f20800zdlpuopuiu;

    public zoijcleaow(AssetManager assetManager, String str) {
        this.f20799yggfygwlhe = assetManager;
        this.f20800zdlpuopuiu = str;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        try {
            Object objGxszxtbevo = gxszxtbevo(this.f20799yggfygwlhe, this.f20800zdlpuopuiu);
            this.f20798jyumaefscl = objGxszxtbevo;
            iobyxmoadgVar.gxszxtbevo(objGxszxtbevo);
        } catch (IOException e13) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e13);
            }
            iobyxmoadgVar.ppxfxbqfkf(e13);
        }
    }

    protected abstract Object gxszxtbevo(AssetManager assetManager, String str);

    protected abstract void ppxfxbqfkf(Object obj);

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public l8.iobyxmoadg wkgbmnqykc() {
        return l8.iobyxmoadg.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void zoijcleaow() {
        Object obj = this.f20798jyumaefscl;
        if (obj == null) {
            return;
        }
        try {
            ppxfxbqfkf(obj);
        } catch (IOException unused) {
        }
    }
}
