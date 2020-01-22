package eu.benschroeder.assertj;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.assertj.core.api.AbstractBigIntegerAssert;
import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.assertj.core.api.AbstractBooleanAssert;
import org.assertj.core.api.AbstractByteArrayAssert;
import org.assertj.core.api.AbstractByteAssert;
import org.assertj.core.api.AbstractCharArrayAssert;
import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.AbstractCharacterAssert;
import org.assertj.core.api.AbstractComparableAssert;
import org.assertj.core.api.AbstractDateAssert;
import org.assertj.core.api.AbstractDoubleArrayAssert;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.api.AbstractFileAssert;
import org.assertj.core.api.AbstractFloatArrayAssert;
import org.assertj.core.api.AbstractFloatAssert;
import org.assertj.core.api.AbstractInputStreamAssert;
import org.assertj.core.api.AbstractInstantAssert;
import org.assertj.core.api.AbstractIntArrayAssert;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AbstractLocalDateAssert;
import org.assertj.core.api.AbstractLocalDateTimeAssert;
import org.assertj.core.api.AbstractLocalTimeAssert;
import org.assertj.core.api.AbstractLongArrayAssert;
import org.assertj.core.api.AbstractLongAssert;
import org.assertj.core.api.AbstractOffsetDateTimeAssert;
import org.assertj.core.api.AbstractOffsetTimeAssert;
import org.assertj.core.api.AbstractPathAssert;
import org.assertj.core.api.AbstractShortArrayAssert;
import org.assertj.core.api.AbstractShortAssert;
import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.AbstractUriAssert;
import org.assertj.core.api.AbstractUrlAssert;
import org.assertj.core.api.AbstractZonedDateTimeAssert;
import org.assertj.core.api.AssertDelegateTarget;
import org.assertj.core.api.AssertFactory;
import org.assertj.core.api.AssertProvider;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AtomicBooleanAssert;
import org.assertj.core.api.AtomicIntegerArrayAssert;
import org.assertj.core.api.AtomicIntegerAssert;
import org.assertj.core.api.AtomicIntegerFieldUpdaterAssert;
import org.assertj.core.api.AtomicLongArrayAssert;
import org.assertj.core.api.AtomicLongAssert;
import org.assertj.core.api.AtomicLongFieldUpdaterAssert;
import org.assertj.core.api.AtomicMarkableReferenceAssert;
import org.assertj.core.api.AtomicReferenceArrayAssert;
import org.assertj.core.api.AtomicReferenceAssert;
import org.assertj.core.api.AtomicReferenceFieldUpdaterAssert;
import org.assertj.core.api.AtomicStampedReferenceAssert;
import org.assertj.core.api.BigIntegerAssert;
import org.assertj.core.api.ClassAssert;
import org.assertj.core.api.ClassBasedNavigableIterableAssert;
import org.assertj.core.api.ClassBasedNavigableListAssert;
import org.assertj.core.api.CompletableFutureAssert;
import org.assertj.core.api.Condition;
import org.assertj.core.api.DoublePredicateAssert;
import org.assertj.core.api.FactoryBasedNavigableIterableAssert;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.assertj.core.api.FutureAssert;
import org.assertj.core.api.InstanceOfAssertFactory;
import org.assertj.core.api.IntPredicateAssert;
import org.assertj.core.api.IterableAssert;
import org.assertj.core.api.IteratorAssert;
import org.assertj.core.api.ListAssert;
import org.assertj.core.api.LongPredicateAssert;
import org.assertj.core.api.MapAssert;
import org.assertj.core.api.ObjectArrayAssert;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.OptionalAssert;
import org.assertj.core.api.OptionalDoubleAssert;
import org.assertj.core.api.OptionalIntAssert;
import org.assertj.core.api.OptionalLongAssert;
import org.assertj.core.api.PredicateAssert;
import org.assertj.core.api.SpliteratorAssert;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableTypeAssert;
import org.assertj.core.api.filter.Filters;
import org.assertj.core.api.filter.InFilter;
import org.assertj.core.api.filter.NotFilter;
import org.assertj.core.api.filter.NotInFilter;
import org.assertj.core.condition.DoesNotHave;
import org.assertj.core.condition.Not;
import org.assertj.core.data.Index;
import org.assertj.core.data.MapEntry;
import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;
import org.assertj.core.data.TemporalUnitOffset;
import org.assertj.core.groups.Properties;
import org.assertj.core.groups.Tuple;
import org.assertj.core.presentation.Representation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * AssertJ {@link Assertions} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 *
 * @author Benjamin Schröder
 */
public interface WithAssertions {

  /**
   * @see Assertions#assertThat(Predicate)
   */
  default <T> PredicateAssert<T> assertThat(Predicate<T> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(IntPredicate)
   */
  default IntPredicateAssert assertThat(IntPredicate actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(LongPredicate)
   */
  default LongPredicateAssert assertThat(LongPredicate actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(DoublePredicate)
   */
  default DoublePredicateAssert assertThat(DoublePredicate actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(CompletableFuture)
   */
  default <RESULT> CompletableFutureAssert<RESULT> assertThat(CompletableFuture<RESULT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(CompletionStage)
   */
  default <RESULT> CompletableFutureAssert<RESULT> assertThat(CompletionStage<RESULT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Optional)
   */
  default <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(OptionalDouble)
   */
  default OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(OptionalInt)
   */
  default OptionalIntAssert assertThat(OptionalInt actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(OptionalLong)
   */
  default OptionalLongAssert assertThat(OptionalLong actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(BigDecimal)
   */
  default AbstractBigDecimalAssert<?> assertThat(BigDecimal actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(BigInteger)
   */
  default AbstractBigIntegerAssert<?> assertThat(BigInteger actual) {
    return new BigIntegerAssert(actual);
  }

  /**
   * @see Assertions#assertThat(URI)
   */
  default AbstractUriAssert<?> assertThat(URI actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(URL)
   */
  default AbstractUrlAssert<?> assertThat(URL actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(boolean)
   */
  default AbstractBooleanAssert<?> assertThat(boolean actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Boolean)
   */
  default AbstractBooleanAssert<?> assertThat(Boolean actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(boolean[])
   */
  default AbstractBooleanArrayAssert<?> assertThat(boolean[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(byte)
   */
  default AbstractByteAssert<?> assertThat(byte actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Byte)
   */
  default AbstractByteAssert<?> assertThat(Byte actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(byte[])
   */
  default AbstractByteArrayAssert<?> assertThat(byte[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(char)
   */
  default AbstractCharacterAssert<?> assertThat(char actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(char[])
   */
  default AbstractCharArrayAssert<?> assertThat(char[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Character)
   */
  default AbstractCharacterAssert<?> assertThat(Character actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Class)
   */
  default ClassAssert assertThat(Class<?> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(double)
   */
  default AbstractDoubleAssert<?> assertThat(double actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Double)
   */
  default AbstractDoubleAssert<?> assertThat(Double actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(double[])
   */
  default AbstractDoubleArrayAssert<?> assertThat(double[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(File)
   */
  default AbstractFileAssert<?> assertThat(File actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Future)
   */
  default <RESULT> FutureAssert<RESULT> assertThat(Future<RESULT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(InputStream)
   */
  default AbstractInputStreamAssert<?, ? extends InputStream> assertThat(InputStream actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(float)
   */
  default AbstractFloatAssert<?> assertThat(float actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Float)
   */
  default AbstractFloatAssert<?> assertThat(Float actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(float[])
   */
  default AbstractFloatArrayAssert<?> assertThat(float[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(int)
   */
  default AbstractIntegerAssert<?> assertThat(int actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(int[])
   */
  default AbstractIntArrayAssert<?> assertThat(int[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Integer)
   */
  default AbstractIntegerAssert<?> assertThat(Integer actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Iterable, AssertFactory)
   */
  default <ACTUAL extends Iterable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  FactoryBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(Iterable<? extends ELEMENT> actual,
                                                                                     AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory) {
    return Assertions.assertThat(actual, assertFactory);
  }

  /**
   * @see Assertions#assertThat(ACTUAL, Class)
   */
  default <ACTUAL extends Iterable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  ClassBasedNavigableIterableAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(ACTUAL actual,
                                                                                   Class<ELEMENT_ASSERT> assertClass) {
    return Assertions.assertThat(actual, assertClass);
  }

  /**
   * @see Assertions#assertThat(List, AssertFactory)
   */
  default <ACTUAL extends List<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  FactoryBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(List<? extends ELEMENT> actual,
                                                                                 AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory) {
    return Assertions.assertThat(actual, assertFactory);
  }

  /**
   * @see Assertions#assertThat(List, Class)
   */
  default <ELEMENT, ACTUAL extends List<? extends ELEMENT>, ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
  ClassBasedNavigableListAssert<?, ACTUAL, ELEMENT, ELEMENT_ASSERT> assertThat(List<? extends ELEMENT> actual,
                                                                               Class<ELEMENT_ASSERT> assertClass) {
    return Assertions.assertThat(actual, assertClass);
  }

  /**
   * @see Assertions#assertThat(long)
   */
  default AbstractLongAssert<?> assertThat(long actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Long)
   */
  default AbstractLongAssert<?> assertThat(Long actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(long[])
   */
  default AbstractLongArrayAssert<?> assertThat(long[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(T)
   */
  default <T> ObjectAssert<T> assertThat(T actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(T[])
   */
  default <T> ObjectArrayAssert<T> assertThat(T[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(short)
   */
  default AbstractShortAssert<?> assertThat(short actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Short)
   */
  default AbstractShortAssert<?> assertThat(Short actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(short[])
   */
  default AbstractShortArrayAssert<?> assertThat(short[] actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Date)
   */
  default AbstractDateAssert<?> assertThat(Date actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(ZonedDateTime)
   */
  default AbstractZonedDateTimeAssert<?> assertThat(ZonedDateTime actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(LocalDateTime)
   */
  default AbstractLocalDateTimeAssert<?> assertThat(LocalDateTime actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(OffsetDateTime)
   */
  default AbstractOffsetDateTimeAssert<?> assertThat(OffsetDateTime actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(OffsetTime)
   */
  default AbstractOffsetTimeAssert<?> assertThat(OffsetTime actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(LocalTime)
   */
  default AbstractLocalTimeAssert<?> assertThat(LocalTime actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(LocalDate)
   */
  default AbstractLocalDateAssert<?> assertThat(LocalDate actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Instant)
   */
  default AbstractInstantAssert<?> assertThat(Instant actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicBoolean)
   */
  default AtomicBooleanAssert assertThat(AtomicBoolean actual) {
    return new AtomicBooleanAssert(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicInteger)
   */
  default AtomicIntegerAssert assertThat(AtomicInteger actual) {
    return new AtomicIntegerAssert(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicIntegerArray)
   */
  default AtomicIntegerArrayAssert assertThat(AtomicIntegerArray actual) {
    return new AtomicIntegerArrayAssert(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicIntegerFieldUpdater)
   */
  default <OBJECT> AtomicIntegerFieldUpdaterAssert<OBJECT> assertThat(AtomicIntegerFieldUpdater<OBJECT> actual) {
    return new AtomicIntegerFieldUpdaterAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicLong)
   */
  default AtomicLongAssert assertThat(AtomicLong actual) {
    return new AtomicLongAssert(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicLongArray)
   */
  default AtomicLongArrayAssert assertThat(AtomicLongArray actual) {
    return new AtomicLongArrayAssert(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicLongFieldUpdater)
   */
  default <OBJECT> AtomicLongFieldUpdaterAssert<OBJECT> assertThat(AtomicLongFieldUpdater<OBJECT> actual) {
    return new AtomicLongFieldUpdaterAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicReference)
   */
  default <VALUE> AtomicReferenceAssert<VALUE> assertThat(AtomicReference<VALUE> actual) {
    return new AtomicReferenceAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicReferenceArray)
   */
  default <ELEMENT> AtomicReferenceArrayAssert<ELEMENT> assertThat(AtomicReferenceArray<ELEMENT> actual) {
    return new AtomicReferenceArrayAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicReferenceFieldUpdater)
   */
  default <FIELD, OBJECT> AtomicReferenceFieldUpdaterAssert<FIELD, OBJECT> assertThat(AtomicReferenceFieldUpdater<OBJECT, FIELD> actual) {
    return new AtomicReferenceFieldUpdaterAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicMarkableReference)
   */
  default <VALUE> AtomicMarkableReferenceAssert<VALUE> assertThat(AtomicMarkableReference<VALUE> actual) {
    return new AtomicMarkableReferenceAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(AtomicStampedReference)
   */
  default <VALUE> AtomicStampedReferenceAssert<VALUE> assertThat(AtomicStampedReference<VALUE> actual) {
    return new AtomicStampedReferenceAssert<>(actual);
  }

  /**
   * @see Assertions#assertThat(Throwable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> assertThat(Throwable actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThatThrownBy(ThrowableAssert.ThrowingCallable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> assertThatThrownBy(ThrowableAssert.ThrowingCallable shouldRaiseThrowable) {
    return Assertions.assertThatThrownBy(shouldRaiseThrowable);
  }

  /**
   * @see Assertions#assertThatThrownBy(ThrowableAssert.ThrowingCallable, String, Object...)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> assertThatThrownBy(ThrowableAssert.ThrowingCallable shouldRaiseThrowable,
                                                                             String description, Object... args) {
    return Assertions.assertThatThrownBy(shouldRaiseThrowable, description, args);
  }

  /**
   * @see Assertions#assertThatCode(ThrowableAssert.ThrowingCallable)
   */
  default AbstractThrowableAssert<?, ? extends Throwable> assertThatCode(ThrowableAssert.ThrowingCallable shouldRaiseOrNotThrowable) {
    return Assertions.assertThatCode(shouldRaiseOrNotThrowable);
  }

  /**
   * @see Assertions#assertThatObject(T)
   */
  default <T> ObjectAssert<T> assertThatObject(T actual) {
    return assertThat(actual);
  }

  /**
   * @see Assertions#catchThrowable(ThrowableAssert.ThrowingCallable)
   */
  default Throwable catchThrowable(ThrowableAssert.ThrowingCallable shouldRaiseThrowable) {
    return Assertions.catchThrowable(shouldRaiseThrowable);
  }

  /**
   * @see Assertions#catchThrowableOfType(ThrowableAssert.ThrowingCallable, Class)
   */
  default <THROWABLE extends Throwable> THROWABLE catchThrowableOfType(ThrowableAssert.ThrowingCallable shouldRaiseThrowable,
                                                                       Class<THROWABLE> type) {
    return Assertions.catchThrowableOfType(shouldRaiseThrowable, type);
  }

  /**
   * @see Assertions#assertThatExceptionOfType(Class)
   */
  default <T extends Throwable> ThrowableTypeAssert<T> assertThatExceptionOfType(final Class<? extends T> exceptionType) {
    return Assertions.assertThatExceptionOfType(exceptionType);
  }

  /**
   * @see Assertions#assertThatNullPointerException()
   */
  default ThrowableTypeAssert<NullPointerException> assertThatNullPointerException() {
    return assertThatExceptionOfType(NullPointerException.class);
  }

  /**
   * @see Assertions#assertThatIllegalArgumentException()
   */
  default ThrowableTypeAssert<IllegalArgumentException> assertThatIllegalArgumentException() {
    return assertThatExceptionOfType(IllegalArgumentException.class);
  }

  /**
   * @see Assertions#assertThatIOException()
   */
  default ThrowableTypeAssert<IOException> assertThatIOException() {
    return assertThatExceptionOfType(IOException.class);
  }

  /**
   * @see Assertions#assertThatIllegalStateException()
   */
  default ThrowableTypeAssert<IllegalStateException> assertThatIllegalStateException() {
    return assertThatExceptionOfType(IllegalStateException.class);
  }

  /**
   * @see Assertions#setRemoveAssertJRelatedElementsFromStackTrace(boolean)
   */
  default void setRemoveAssertJRelatedElementsFromStackTrace(boolean removeAssertJRelatedElementsFromStackTrace) {
    Assertions.setRemoveAssertJRelatedElementsFromStackTrace(removeAssertJRelatedElementsFromStackTrace);
  }

  /**
   * @see Assertions#fail(String)
   */
  default <T> T fail(String failureMessage) {
    return Assertions.fail(failureMessage);
  }

  /**
   * @see Assertions#fail(String, Object...)
   */
  default <T> T fail(String failureMessage, Object... args) {
    return Assertions.fail(failureMessage, args);
  }

  /**
   * @see Assertions#fail(String, Throwable)
   */
  default <T> T fail(String failureMessage, Throwable realCause) {
    return Assertions.fail(failureMessage, realCause);
  }

  /**
   * @see Assertions#failBecauseExceptionWasNotThrown(Class)
   */
  default <T> T failBecauseExceptionWasNotThrown(Class<? extends Throwable> throwableClass) {
    return Assertions.shouldHaveThrown(throwableClass);
  }

  /**
   * @see Assertions#shouldHaveThrown(Class)
   */
  default <T> T shouldHaveThrown(Class<? extends Throwable> throwableClass) {
    return Assertions.shouldHaveThrown(throwableClass);
  }

  /**
   * @see Assertions#setMaxLengthForSingleLineDescription(int)
   */
  default void setMaxLengthForSingleLineDescription(int maxLengthForSingleLineDescription) {
    Assertions.setMaxLengthForSingleLineDescription(maxLengthForSingleLineDescription);
  }

  /**
   * @see Assertions#setMaxElementsForPrinting(int)
   */
  default void setMaxElementsForPrinting(int maxElementsForPrinting) {
    Assertions.setMaxElementsForPrinting(maxElementsForPrinting);
  }

  /**
   * @see Assertions#extractProperty(String, Class)
   */
  default <T> Properties<T> extractProperty(String propertyName, Class<T> propertyType) {
    return Assertions.extractProperty(propertyName, propertyType);
  }

  /**
   * @see Assertions#extractProperty(String)
   */
  default Properties<Object> extractProperty(String propertyName) {
    return Assertions.extractProperty(propertyName);
  }

  /**
   * @see Assertions#tuple(Object...)
   */
  default Tuple tuple(Object... values) {
    return Assertions.tuple(values);
  }

  /**
   * @see Assertions#setAllowExtractingPrivateFields(boolean)
   */
  default void setAllowExtractingPrivateFields(boolean allowExtractingPrivateFields) {
    Assertions.setAllowExtractingPrivateFields(allowExtractingPrivateFields);
  }

  /**
   * @see Assertions#setAllowComparingPrivateFields(boolean)
   */
  default void setAllowComparingPrivateFields(boolean allowComparingPrivateFields) {
    Assertions.setAllowComparingPrivateFields(allowComparingPrivateFields);
  }

  /**
   * @see Assertions#setExtractBareNamePropertyMethods(boolean)
   */
  default void setExtractBareNamePropertyMethods(boolean barenamePropertyMethods) {
    Assertions.setExtractBareNamePropertyMethods(barenamePropertyMethods);
  }

  /**
   * @see Assertions#entry(K, V)
   */
  default <K, V> MapEntry<K, V> entry(K key, V value) {
    return Assertions.entry(key, value);
  }


  /**
   * @see Assertions#atIndex(int)
   */
  default Index atIndex(int index) {
    return Assertions.atIndex(index);
  }

  /**
   * @see Assertions#offset(Double)
   */
  default Offset<Double> offset(Double value) {
    return Assertions.offset(value);
  }

  /**
   * @see Assertions#offset(Float)
   */
  default Offset<Float> offset(Float value) {
    return Assertions.offset(value);
  }

  /**
   * @see Assertions#within(Double)
   */
  default Offset<Double> within(Double value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#withPrecision(Double)
   */
  default Offset<Double> withPrecision(Double value) {
    return Assertions.withPrecision(value);
  }

  /**
   * @see Assertions#within(Float)
   */
  default Offset<Float> within(Float value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#withPrecision(Float)
   */
  default Offset<Float> withPrecision(Float value) {
    return Assertions.withPrecision(value);
  }

  /**
   * @see Assertions#within(BigDecimal)
   */
  default Offset<BigDecimal> within(BigDecimal value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#within(BigInteger)
   */
  default Offset<BigInteger> within(BigInteger value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#within(Byte)
   */
  default Offset<Byte> within(Byte value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#within(Integer)
   */
  default Offset<Integer> within(Integer value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#within(Short)
   */
  default Offset<Short> within(Short value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#within(Long)
   */
  default Offset<Long> within(Long value) {
    return Assertions.within(value);
  }

  /**
   * @see Assertions#within(long, TemporalUnit)
   */
  default TemporalUnitOffset within(long value, TemporalUnit unit) {
    return Assertions.within(value, unit);
  }

  /**
   * @see Assertions#withinPercentage(Double)
   */
  default Percentage withinPercentage(Double value) {
    return Assertions.withinPercentage(value);
  }

  /**
   * @see Assertions#withinPercentage(Integer)
   */
  default Percentage withinPercentage(Integer value) {
    return Assertions.withinPercentage(value);
  }

  /**
   * @see Assertions#withinPercentage(Long)
   */
  default Percentage withinPercentage(Long value) {
    return Assertions.withinPercentage(value);
  }

  /**
   * @see Assertions#withinPercentage(Double)
   */
  default Offset<Double> byLessThan(Double value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(Float)
   */
  default Offset<Float> byLessThan(Float value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(BigDecimal)
   */
  default Offset<BigDecimal> byLessThan(BigDecimal value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(BigInteger)
   */
  default Offset<BigInteger> byLessThan(BigInteger value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(Byte)
   */
  default Offset<Byte> byLessThan(Byte value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(Integer)
   */
  default Offset<Integer> byLessThan(Integer value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(Short)
   */
  default Offset<Short> byLessThan(Short value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(Long)
   */
  default Offset<Long> byLessThan(Long value) {
    return Assertions.byLessThan(value);
  }

  /**
   * @see Assertions#byLessThan(long, TemporalUnit)
   */
  default TemporalUnitOffset byLessThan(long value, TemporalUnit unit) {
    return Assertions.byLessThan(value, unit);
  }

  /**
   * @see Assertions#from(Function)
   */
  default <F, T> Function<F, T> from(Function<F, T> extractor) {
    return Assertions.from(extractor);
  }

  /**
   * @see Assertions#as(InstanceOfAssertFactory)
   */
  default <T, ASSERT extends AbstractAssert<?, ?>> InstanceOfAssertFactory<T, ASSERT> as(InstanceOfAssertFactory<T, ASSERT> assertFactory) {
    return Assertions.as(assertFactory);
  }

  /**
   * @see Assertions#allOf(Condition...)
   */
  default <T> Condition<T> allOf(Condition<? super T>... conditions) {
    return Assertions.allOf(conditions);
  }

  /**
   * @see Assertions#allOf(Iterable)
   */
  default <T> Condition<T> allOf(Iterable<? extends Condition<? super T>> conditions) {
    return Assertions.allOf(conditions);
  }

  /**
   * @see Assertions#anyOf(Condition...)
   */
  default <T> Condition<T> anyOf(Condition<? super T>... conditions) {
    return Assertions.anyOf(conditions);
  }

  /**
   * @see Assertions#anyOf(Iterable)
   */
  default <T> Condition<T> anyOf(Iterable<? extends Condition<? super T>> conditions) {
    return Assertions.anyOf(conditions);
  }

  /**
   * @see Assertions#doesNotHave(Condition)
   */
  default <T> DoesNotHave<T> doesNotHave(Condition<? super T> condition) {
    return Assertions.doesNotHave(condition);
  }

  /**
   * @see Assertions#not(Condition)
   */
  default <T> Not<T> not(Condition<? super T> condition) {
    return Assertions.not(condition);
  }

  /**
   * @see Assertions#filter(E[])
   */
  default <E> Filters<E> filter(E[] array) {
    return Assertions.filter(array);
  }

  /**
   * @see Assertions#filter(Iterable)
   */
  default <E> Filters<E> filter(Iterable<E> iterableToFilter) {
    return Assertions.filter(iterableToFilter);
  }

  /**
   * @see Assertions#in(Object...)
   */
  default InFilter in(Object... values) {
    return Assertions.in(values);
  }

  /**
   * @see Assertions#notIn(Object...)
   */
  default NotInFilter notIn(Object... valuesNotToMatch) {
    return Assertions.notIn(valuesNotToMatch);
  }

  /**
   * @see Assertions#not(Object)
   */
  default NotFilter not(Object valueNotToMatch) {
    return Assertions.not(valueNotToMatch);
  }

  /**
   * @see Assertions#contentOf(File, Charset)
   */
  default String contentOf(File file, Charset charset) {
    return Assertions.contentOf(file, charset);
  }

  /**
   * @see Assertions#contentOf(File, String)
   */
  default String contentOf(File file, String charsetName) {
    return Assertions.contentOf(file, charsetName);
  }

  /**
   * @see Assertions#contentOf(File)
   */
  default String contentOf(File file) {
    return Assertions.contentOf(file, Charset.defaultCharset());
  }

  /**
   * @see Assertions#linesOf(File)
   */
  default List<String> linesOf(File file) {
    return Assertions.linesOf(file, Charset.defaultCharset());
  }

  /**
   * @see Assertions#linesOf(File, Charset)
   */
  default List<String> linesOf(File file, Charset charset) {
    return Assertions.linesOf(file, charset);
  }

  /**
   * @see Assertions#linesOf(File, String)
   */
  default List<String> linesOf(File file, String charsetName) {
    return Assertions.linesOf(file, charsetName);
  }

  /**
   * @see Assertions#contentOf(URL, Charset)
   */
  default String contentOf(URL url, Charset charset) {
    return Assertions.contentOf(url, charset);
  }

  /**
   * @see Assertions#contentOf(URL, String)
   */
  default String contentOf(URL url, String charsetName) {
    return Assertions.contentOf(url, charsetName);
  }

  /**
   * @see Assertions#contentOf(URL)
   */
  default String contentOf(URL url) {
    return Assertions.contentOf(url, Charset.defaultCharset());
  }

  /**
   * @see Assertions#linesOf(URL)
   */
  default List<String> linesOf(URL url) {
    return Assertions.linesOf(url, Charset.defaultCharset());
  }

  /**
   * @see Assertions#linesOf(URL, Charset)
   */
  default List<String> linesOf(URL url, Charset charset) {
    return Assertions.linesOf(url, charset);
  }

  /**
   * @see Assertions#linesOf(URL, String)
   */
  default List<String> linesOf(URL url, String charsetName) {
    return Assertions.linesOf(url, charsetName);
  }

  /**
   * @see Assertions#setLenientDateParsing(boolean)
   */
  default void setLenientDateParsing(boolean value) {
    Assertions.setLenientDateParsing(value);
  }

  /**
   * @see Assertions#registerCustomDateFormat(DateFormat)
   */
  default void registerCustomDateFormat(DateFormat userCustomDateFormat) {
    Assertions.registerCustomDateFormat(userCustomDateFormat);
  }

  /**
   * @see Assertions#registerCustomDateFormat(String)
   */
  default void registerCustomDateFormat(String userCustomDateFormatPattern) {
    Assertions.registerCustomDateFormat(userCustomDateFormatPattern);
  }

  /**
   * @see Assertions#useDefaultDateFormatsOnly()
   */
  default void useDefaultDateFormatsOnly() {
    Assertions.useDefaultDateFormatsOnly();
  }

  /**
   * @see Assertions#assertThat(AssertProvider)
   */
  default <T> T assertThat(final AssertProvider<T> component) {
    return Assertions.assertThat(component);
  }

  /**
   * @see Assertions#assertThat(CharSequence)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(CharSequence actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(StringBuilder)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(StringBuilder actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(StringBuffer)
   */
  default AbstractCharSequenceAssert<?, ? extends CharSequence> assertThat(StringBuffer actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(String)
   */
  default AbstractStringAssert<?> assertThat(String actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Iterable)
   */
  default <ELEMENT> IterableAssert<ELEMENT> assertThat(Iterable<? extends ELEMENT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Iterator)
   */
  default <ELEMENT> IteratorAssert<ELEMENT> assertThat(Iterator<? extends ELEMENT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(List)
   */
  default <ELEMENT> ListAssert<ELEMENT> assertThat(List<? extends ELEMENT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Stream)
   */
  default <ELEMENT> ListAssert<ELEMENT> assertThat(Stream<? extends ELEMENT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(DoubleStream)
   */
  default ListAssert<Double> assertThat(DoubleStream actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(LongStream)
   */
  default ListAssert<Long> assertThat(LongStream actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(IntStream)
   */
  default ListAssert<Integer> assertThat(IntStream actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Spliterator)
   */
  default <ELEMENT> SpliteratorAssert<ELEMENT> assertThat(Spliterator<ELEMENT> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Path)
   */
  default AbstractPathAssert<?> assertThat(Path actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(Map)
   */
  default <K, V> MapAssert<K, V> assertThat(Map<K, V> actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(T)
   */
  default <T extends Comparable<? super T>> AbstractComparableAssert<?, T> assertThat(T actual) {
    return Assertions.assertThat(actual);
  }

  /**
   * @see Assertions#assertThat(T)
   */
  default <T extends AssertDelegateTarget> T assertThat(T assertion) {
    return Assertions.assertThat(assertion);
  }

  /**
   * @see Assertions#useRepresentation(Representation)
   */
  default void useRepresentation(Representation customRepresentation) {
    Assertions.useRepresentation(customRepresentation);
  }

  /**
   * @see Assertions#registerFormatterForType(Class, Function)
   */
  default <T> void registerFormatterForType(Class<T> type, Function<T, String> formatter) {
    Assertions.registerFormatterForType(type, formatter);
  }

  /**
   * @see Assertions#useDefaultRepresentation()
   */
  default void useDefaultRepresentation() {
    Assertions.useDefaultRepresentation();
  }

}
