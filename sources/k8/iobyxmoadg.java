package k8;

import android.util.Log;
import com.bumptech.glide.btonecajqb;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.wkgbmnqykc;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import g9.gtknphoqwx;
import g9.ppxfxbqfkf;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import lk.cdpycssgdh;
import lk.eablkybsjg;
import lk.gxszxtbevo;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;
import r8.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements wkgbmnqykc, gxszxtbevo {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private wkgbmnqykc.iobyxmoadg f54114cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private volatile eablkybsjg f54115esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private yadqdtsiqt f54116iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private InputStream f54117jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final nufgyqmvbu f54118yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final eablkybsjg.iobyxmoadg f54119zdlpuopuiu;

    public iobyxmoadg(eablkybsjg.iobyxmoadg iobyxmoadgVar, nufgyqmvbu nufgyqmvbuVar) {
        this.f54119zdlpuopuiu = iobyxmoadgVar;
        this.f54118yggfygwlhe = nufgyqmvbuVar;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void cancel() {
        eablkybsjg eablkybsjgVar = this.f54115esjtqupxsv;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void eablkybsjg(btonecajqb btonecajqbVar, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        zynmafqrjb.iobyxmoadg iobyxmoadgVarKcexrzcfyt = new zynmafqrjb.iobyxmoadg().kcexrzcfyt(this.f54118yggfygwlhe.nufgyqmvbu());
        for (Map.Entry entry : this.f54118yggfygwlhe.eablkybsjg().entrySet()) {
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg((String) entry.getKey(), (String) entry.getValue());
        }
        zynmafqrjb zynmafqrjbVarZoijcleaow = iobyxmoadgVarKcexrzcfyt.zoijcleaow();
        this.f54114cqumvgiudr = iobyxmoadgVar;
        this.f54115esjtqupxsv = this.f54119zdlpuopuiu.iobyxmoadg(zynmafqrjbVarZoijcleaow);
        FirebasePerfOkHttpClient.enqueue(this.f54115esjtqupxsv, this);
    }

    @Override // lk.gxszxtbevo
    public void gxszxtbevo(eablkybsjg eablkybsjgVar, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f54114cqumvgiudr.ppxfxbqfkf(iOException);
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public Class iobyxmoadg() {
        return InputStream.class;
    }

    @Override // lk.gxszxtbevo
    public void ppxfxbqfkf(eablkybsjg eablkybsjgVar, cdpycssgdh cdpycssgdhVar) {
        this.f54116iwizpuwonk = cdpycssgdhVar.wkgbmnqykc();
        if (!cdpycssgdhVar.iwxlajgraz()) {
            this.f54114cqumvgiudr.ppxfxbqfkf(new HttpException(cdpycssgdhVar.zdlpuopuiu(), cdpycssgdhVar.btonecajqb()));
            return;
        }
        InputStream inputStreamWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(this.f54116iwizpuwonk.iobyxmoadg(), ((yadqdtsiqt) gtknphoqwx.eablkybsjg(this.f54116iwizpuwonk)).nufgyqmvbu());
        this.f54117jyumaefscl = inputStreamWkgbmnqykc;
        this.f54114cqumvgiudr.gxszxtbevo(inputStreamWkgbmnqykc);
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public l8.iobyxmoadg wkgbmnqykc() {
        return l8.iobyxmoadg.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.wkgbmnqykc
    public void zoijcleaow() {
        try {
            InputStream inputStream = this.f54117jyumaefscl;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        yadqdtsiqt yadqdtsiqtVar = this.f54116iwizpuwonk;
        if (yadqdtsiqtVar != null) {
            yadqdtsiqtVar.close();
        }
        this.f54114cqumvgiudr = null;
    }
}
