package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import t3.dsvhmnatus;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final dsvhmnatus f11683iobyxmoadg;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(dsvhmnatus dsvhmnatusVar) {
        this.f11683iobyxmoadg = dsvhmnatusVar;
    }

    public final boolean iobyxmoadg(yadqdtsiqt yadqdtsiqtVar, long j13) {
        return zoijcleaow(yadqdtsiqtVar) && ppxfxbqfkf(yadqdtsiqtVar, j13);
    }

    protected abstract boolean ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar, long j13);

    protected abstract boolean zoijcleaow(yadqdtsiqt yadqdtsiqtVar);
}
