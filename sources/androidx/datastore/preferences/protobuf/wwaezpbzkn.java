package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface wwaezpbzkn extends ylkuphrtab {

    public interface iobyxmoadg extends ylkuphrtab, Cloneable {
        wwaezpbzkn buildPartial();

        iobyxmoadg wwaezpbzkn(wwaezpbzkn wwaezpbzknVar);
    }

    int getSerializedSize();

    void iobyxmoadg(CodedOutputStream codedOutputStream);

    iobyxmoadg newBuilderForType();

    iobyxmoadg toBuilder();
}
