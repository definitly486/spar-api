package mm;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import lk.yadqdtsiqt;
import lm.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
final class ppxfxbqfkf implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Gson f67471iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TypeAdapter f67472zoijcleaow;

    ppxfxbqfkf(Gson gson, TypeAdapter typeAdapter) {
        this.f67471iobyxmoadg = gson;
        this.f67472zoijcleaow = typeAdapter;
    }

    @Override // lm.gxszxtbevo
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Object convert(yadqdtsiqt yadqdtsiqtVar) {
        ce.iobyxmoadg iobyxmoadgVarVdvldrhtss = this.f67471iobyxmoadg.vdvldrhtss(yadqdtsiqtVar.wkgbmnqykc());
        try {
            Object objZoijcleaow = this.f67472zoijcleaow.zoijcleaow(iobyxmoadgVarVdvldrhtss);
            if (iobyxmoadgVarVdvldrhtss.kegysxyocb() != ce.zoijcleaow.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            yadqdtsiqtVar.close();
            return objZoijcleaow;
        } catch (Throwable th2) {
            yadqdtsiqtVar.close();
            throw th2;
        }
    }
}
