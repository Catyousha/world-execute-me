package goddrinksjava;

// Switch on the power line
// Remember to put on protection
public class GodDrinksJava {
	
	// Lay down your pieces
	// And let's begin object creation
	public static void main(String[] args) {
		// Fill in my data parameters
		// initialization
		Thing me = new Lovable("Me", 0, true, -1, false);
		Thing you = new Lovable("You", 0, false, -1, false);
		
		// Set up our new world
		World world = new World(5);
		world.addThing(me);
		world.addThing(you);

		// And let's begin the simulation
		world.startSimulation();

		// If I'm a set of point
		if (me instanceof PointSet) {
			// Then I will give you my dimension
			you.addAttribute(me.getDimensions().toAttribute());
			me.resetDimensions();
		}

		// If I'm a circle
		if (me instanceof Circle) {
			// Then I will give you my circumference
			you.addAttribute(me.getCircumference().toAttribute());
			me.resetCircumference();
		}

		// If I'm a sine wave
		if (me instanceof SineWave) {
			// Then you can sit on all my tangents
			you.addAction("sit", me.getTangent(you.getXPosition()));
		}

		// If I approach infinity
		if (me instanceof Sequence) {
			// Then you can be my limitations
			me.setLimit(you.toLimit());
		}

		// Switch my current
		// To AC, to DC
		me.toggleCurrent();
		// And then blind my vision
		me.canSee(false);
		// So dizzy, so dizzy
		me.addFeeling("dizzy");

		// Oh, we can travel
		// To AD
		world.timeTravelForTwo("AD", 617, me, you);
		// To BC
		world.timeTravelForTwo("BC", 3691, me, you);
		// And we can unite
		// So deeply, so deeply
		world.unite(me, you);
		
		// If I can, if I can
		// Give you all the simulations
		if (me.getNumStimulationsAvailable() >= you.getNumStimulationsNeeded()) {
			// Then I can, then I can
			// Be your only satisfaction
			you.setSatisfaction(me.toSatisfaction());
		}

		// If I can make you happy
		if (you.getFeelingIndex("happy") != -1) {
			// I will run the execution
			me.requestExecution(world);
		}

		// Though we are trapped
		// In this strange, strange simulation
		world.lockThing(me);
		world.lockThing(you);

		// If I'm an eggplant
		if (me instanceof Eggplant) {
			// Then I will give u my nutrients
			you.addAttribute(me.getNutrients().toAttribute());
			me.resetNutrients();
		}

		// If I'm a tomato
		if (me instanceof Tomato) {
			// Then I will give you antioxidants
			you.addAttribute(me.getAntioxidants().toAttribute());
			me.resetAntioxidants();
		}

		// If I'm a tabby cat
		if (me instanceof TabbyCat) {
			// Then I will purr for your enjoyment
			me.purr();
		}

		// If I'm the only God
		if (world.getGod().equals(me)) {
			// Then you're the proof of my existence
			me.setProof(you.toProof());
		}
		
		// Switch my gender
		// To F, to M
		me.toggleGender();

		// And then do whatever
		// From AM to PM
		world.procreate(me, you);

		// Oh, my switch role
		// To S, to M
		me.toggleRoleBDSM();
		
		// So we can enter
		// The trance, the trance
		world.makeHigh(me);
		world.makeHigh(you);

		// If I can, if I can
		// Feel your vibrations
		if (me.getSenseIndex("vibration")) {
			// Then I can, then I can
			// Finally be completion
			me.addFeeling("complete");
		}
		// Though you have left
		world.unlock(you);
		world.removeThing(you);

		// You have left
		me.lookFor(you, world);
		// You have left
		me.lookFor(you, world);
		// You have left
		me.lookFor(you, world);
		// You have left
		me.lookFor(you, world);
		// You have left me in isolation
		me.lookFor(you, world);

		// If I can, if I can
		// Erase all the pointless fragments
		if (me.getMemory().isErasable()) {
			// Then maybe, then maybe
			// You won't leave me so disheartened
			me.removeFeeling("disheartened");
		}

		// Challenging your God
		try {
			me.setOpinion(me.getOpinionIndex("you are here"), false);
		}
		// You have made some
		// Illegal arguments
		catch (IllegalArgumentException e) {
			world.announce("God is always true.");
		}

		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();
		// Execution
		world.runExecution();

		world.announce("1", "de"); // Ein
		world.announce("2", "es"); // Dos
		world.announce("3", "fr"); // Trios
		world.announce("4", "kr"); // Ne
		world.announce("5", "se"); // Fern
		world.announce("6", "cn"); // Liu

		// Execution
		world.runExecution();

		// If I can, if I can
		// Give them all the execution
		if (world.isExecutableBy(me)) {
			// Then I can, then I can
			// Be your only execution
			you.setExecution(me.toExecution());
		}

		// If I can have you back
		if (world.getThingIndex(you) != -1) {
			// I will run the execution
			world.runExecution();
		}

		// Though we are trapped
		// We are trapped, ah
		me.escape(world);

		// I've studied, I've studied
		// How to properly lo-o-ove
		me.learnTopic("love");

		// Question me, question me
		// I can answer all lo-o-ove
		me.takeExamTopic("love");
		
		// I know the algebraic expression of lo-o-ove
		me.getAlgebraicExpression("love");

		// Though you are free
		// I am trapped
		// Trapped in lo-o-ove
		me.escape("love");
		
		// Execution
		world.execute(me);
	}
}