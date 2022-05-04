package io.github.daniil547.card.elements;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.test.context.TestPropertySource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@TestPropertySource(properties = "file-storage.file-storage-place = DATABASE")
public class DBAttachmentAndFileStorageTest extends AbstractAttachmentAndFileTest {
}
