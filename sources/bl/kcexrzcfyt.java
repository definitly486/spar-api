package bl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends oxmwwwfdhm {
    private final Long yggfygwlhe(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // bl.oxmwwwfdhm, bl.dxjokdxxww
    public void ppxfxbqfkf(esjtqupxsv source, esjtqupxsv target) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
        try {
            Files.move(source.wflxmlrfwp(), target.wflxmlrfwp(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e13) {
            throw new FileNotFoundException(e13.getMessage());
        }
    }

    @Override // bl.oxmwwwfdhm
    public String toString() {
        return "NioSystemFileSystem";
    }

    @Override // bl.oxmwwwfdhm, bl.dxjokdxxww
    public nufgyqmvbu wflxmlrfwp(esjtqupxsv path) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        Path pathWflxmlrfwp = path.wflxmlrfwp();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathWflxmlrfwp, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathWflxmlrfwp) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            esjtqupxsv esjtqupxsvVarGxszxtbevo = symbolicLink != null ? esjtqupxsv.iobyxmoadg.gxszxtbevo(esjtqupxsv.f16670yggfygwlhe, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lYggfygwlhe = fileTimeCreationTime != null ? yggfygwlhe(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lYggfygwlhe2 = fileTimeLastModifiedTime != null ? yggfygwlhe(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new nufgyqmvbu(zIsRegularFile, zIsDirectory, esjtqupxsvVarGxszxtbevo, lValueOf, lYggfygwlhe, lYggfygwlhe2, fileTimeLastAccessTime != null ? yggfygwlhe(fileTimeLastAccessTime) : null, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
