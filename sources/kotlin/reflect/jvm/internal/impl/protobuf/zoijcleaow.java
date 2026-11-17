package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gxszxtbevo f60186iobyxmoadg = gxszxtbevo.ppxfxbqfkf();

    private UninitializedMessageException eablkybsjg(agtfadlqog agtfadlqogVar) {
        return agtfadlqogVar instanceof iobyxmoadg ? ((iobyxmoadg) agtfadlqogVar).wkgbmnqykc() : new UninitializedMessageException(agtfadlqogVar);
    }

    private agtfadlqog wkgbmnqykc(agtfadlqog agtfadlqogVar) throws InvalidProtocolBufferException {
        if (agtfadlqogVar == null || agtfadlqogVar.isInitialized()) {
            return agtfadlqogVar;
        }
        throw eablkybsjg(agtfadlqogVar).iobyxmoadg().ojitshcjhn(agtfadlqogVar);
    }

    public agtfadlqog dxjokdxxww(InputStream inputStream, gxszxtbevo gxszxtbevoVar) throws InvalidProtocolBufferException {
        eablkybsjg eablkybsjgVarLqeggnwhkg = eablkybsjg.lqeggnwhkg(inputStream);
        agtfadlqog agtfadlqogVar = (agtfadlqog) zoijcleaow(eablkybsjgVarLqeggnwhkg, gxszxtbevoVar);
        try {
            eablkybsjgVarLqeggnwhkg.iobyxmoadg(0);
            return agtfadlqogVar;
        } catch (InvalidProtocolBufferException e13) {
            throw e13.ojitshcjhn(agtfadlqogVar);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public agtfadlqog ppxfxbqfkf(InputStream inputStream, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(nufgyqmvbu(inputStream, gxszxtbevoVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public agtfadlqog iobyxmoadg(InputStream inputStream, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(dxjokdxxww(inputStream, gxszxtbevoVar));
    }

    public agtfadlqog nufgyqmvbu(InputStream inputStream, gxszxtbevo gxszxtbevoVar) throws InvalidProtocolBufferException {
        try {
            int i13 = inputStream.read();
            if (i13 == -1) {
                return null;
            }
            return dxjokdxxww(new iobyxmoadg.AbstractC1196iobyxmoadg.C1197iobyxmoadg(inputStream, eablkybsjg.pmvmpeiblj(i13, inputStream)), gxszxtbevoVar);
        } catch (IOException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        }
    }
}
