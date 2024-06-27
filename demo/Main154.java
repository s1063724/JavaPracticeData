import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import java.util.stream.*;
public class Main154{
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("User.class");
		PosixFileAttributeView view = Files.getFileAttributeView(p, PosixFileAttributeView.class);
		Set<PosixFilePermission> permission = Stream.of(
		PosixFilePermission.OWNER_READ,
		PosixFilePermission.OWNER_WRITE,
		PosixFilePermission.OWNER_EXECUTE,
		PosixFilePermission.GROUP_READ,
		PosixFilePermission.GROUP_WRITE,
		PosixFilePermission.GROUP_EXECUTE,
		PosixFilePermission.OTHERS_READ,
		PosixFilePermission.OTHERS_WRITE,
		PosixFilePermission.OTHERS_EXECUTE).collect(Collectors.toSet());
		view.setPermissions(permission);
	}
}
