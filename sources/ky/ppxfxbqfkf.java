package ky;

import b00.FetchDeleteAccountSmsDto;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.user.DeleteAccountSmsModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {
    public static final DeleteAccountSmsModel iobyxmoadg(FetchDeleteAccountSmsDto fetchDeleteAccountSmsDto) {
        zdlpuopuiu.btonecajqb(fetchDeleteAccountSmsDto, "<this>");
        return new DeleteAccountSmsModel(fetchDeleteAccountSmsDto.getDateEnd(), fetchDeleteAccountSmsDto.getDateNow());
    }
}
