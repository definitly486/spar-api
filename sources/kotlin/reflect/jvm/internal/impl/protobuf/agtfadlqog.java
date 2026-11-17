package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public interface agtfadlqog extends ojitshcjhn {

    public interface iobyxmoadg extends Cloneable, ojitshcjhn {
        agtfadlqog build();

        iobyxmoadg kegysxyocb(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar);
    }

    int getSerializedSize();

    void iobyxmoadg(CodedOutputStream codedOutputStream);

    iobyxmoadg newBuilderForType();

    iobyxmoadg toBuilder();
}
