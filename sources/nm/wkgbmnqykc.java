package nm;

import java.io.IOException;
import lk.yadqdtsiqt;

/* JADX INFO: loaded from: classes3.dex */
final class wkgbmnqykc implements lm.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final wkgbmnqykc f70338iobyxmoadg = new wkgbmnqykc();

    wkgbmnqykc() {
    }

    @Override // lm.gxszxtbevo
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Character convert(yadqdtsiqt yadqdtsiqtVar) throws IOException {
        String strAgtfadlqog = yadqdtsiqtVar.agtfadlqog();
        if (strAgtfadlqog.length() == 1) {
            return Character.valueOf(strAgtfadlqog.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strAgtfadlqog.length());
    }
}
