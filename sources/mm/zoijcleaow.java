package mm;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lm.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow implements gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final cqumvgiudr f67473ppxfxbqfkf = cqumvgiudr.ppxfxbqfkf("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Charset f67474wkgbmnqykc = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Gson f67475iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TypeAdapter f67476zoijcleaow;

    zoijcleaow(Gson gson, TypeAdapter typeAdapter) {
        this.f67475iobyxmoadg = gson;
        this.f67476zoijcleaow = typeAdapter;
    }

    @Override // lm.gxszxtbevo
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public istkbnxepw convert(Object obj) throws IOException {
        bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
        ce.ppxfxbqfkf ppxfxbqfkfVarOxmwwwfdhm = this.f67475iobyxmoadg.oxmwwwfdhm(new OutputStreamWriter(ppxfxbqfkfVar.vdvldrhtss(), f67474wkgbmnqykc));
        this.f67476zoijcleaow.wkgbmnqykc(ppxfxbqfkfVarOxmwwwfdhm, obj);
        ppxfxbqfkfVarOxmwwwfdhm.close();
        return istkbnxepw.ppxfxbqfkf(f67473ppxfxbqfkf, ppxfxbqfkfVar.cqumvgiudr());
    }
}
