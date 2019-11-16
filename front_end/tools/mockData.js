const todos = [
    {
        id: 1,
        text: "Take out the trash",
        slug: "take-out-the-trash",
        completed: true
    },
    {
        id: 2,
        text: "Grocery shopping",
        slug: "grocery-shopping",
        completed: false
    },
    {
        id: 3,
        text: "Clean gecko tank",
        slug: "clean-gecko-tank",
        completed: false
    },
    {
        id: 4,
        text: "Mow lawn",
        slug: "mow-lawn",
        completed: true
    },
    {
        id: 5,
        text: "Catch up on Arrested Development",
        slug: "catch-up-on-arrested-development",
        completed: false
    }
];

const newTodo = {
    id: null,
    text: "",
    completed: false
};

module.exports = {
    newTodo,
    todos
};